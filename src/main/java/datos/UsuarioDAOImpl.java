package datos;

import domain.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import password.RecoveryPassword;


public class UsuarioDAOImpl implements UsuarioDAO {

    @Override
    public boolean save(Usuario usuario) {
        boolean flag = false;
        Connection conn = null;
        PreparedStatement pst = null;
        String SQL = "INSERT INTO campus(username, password, email, name, lastname) VALUE (?, ?, ?, ?, ?)";
        try {
            conn = Conexion.getConnection();
            pst = conn.prepareStatement(SQL);
            pst.setString(1, usuario.getUsername());
            pst.setString(2, usuario.getPassword());
            pst.setString(3, usuario.getEmail());
            pst.setString(4, usuario.getName());
            pst.setString(5, usuario.getLastname());
            int row = pst.executeUpdate();
            if (row > 0) {
                flag = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                Conexion.close(pst);
                Conexion.close(conn);
            } catch (SQLException ex) {
            }

        }
        return flag;
    }

    @Override
    public boolean checkLogin(String username, String password) {
        boolean flag = false;
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String SQL = "SELECT * FROM campus where username = '" + username + "'";
        try {
            conn = Conexion.getConnection();
            pst = conn.prepareStatement(SQL);
            rs = pst.executeQuery();
            
            Usuario user = new Usuario();
            
            while (rs.next()){
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                if(user.getUsername().equals(username)){
                    if (user.getPassword().equals(password)){
                        flag = true;
                        break;
                    }
                    
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(pst);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
        return flag;
    }
    
    
    public boolean findUserPassword(String email) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Connection conn = null;
        PreparedStatement pst = null;
        boolean mailExist = false;
        
        String SQL = "SELECT password FROM campus where email = '" + email + "'";
        try {
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = Conexion.getConnection();
            pst = conn.prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();
            Usuario user = new Usuario();
            while(rs.next()){                
                user.setPassword(rs.getString("password"));
            }           
                        
            if(user.getPassword() == null) {
                System.out.println("Your mail doesn't exists");                
            } else {
                RecoveryPassword.resetPassword(email, user.getPassword());
                System.out.println("Messege send");
                mailExist = true;
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {                
                Conexion.close(pst);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return mailExist;
    }
}
