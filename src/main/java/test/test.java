package test;

import datos.Conexion;
import datos.UsuarioDAOImpl;
import java.sql.Connection;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//        Connection conn = Conexion.getConnection();
//        if (conn != null) {
//            System.out.println("Se conecto a base de datos");
//        }else{
//            System.out.println("No se conecto a base de datos");
//        }
        
        UsuarioDAOImpl userdao = new UsuarioDAOImpl();
        if (userdao.findUserPassword("comeoncr7@gmail.com")){
                System.out.println("Email enviado");
        } else {
            System.out.println("no");
        }
        }
}
