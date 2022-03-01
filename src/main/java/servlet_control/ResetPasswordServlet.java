package servlet_control;

import datos.UsuarioDAOImpl;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/resetPassword")
public class ResetPasswordServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        UsuarioDAOImpl daoImpl=new UsuarioDAOImpl();
        String mensaje = " ";
        String recipient = request.getParameter("email");
        System.out.println("si");
        System.out.println(recipient);
        try {
            boolean exist = daoImpl.findUserPassword(recipient);
            if(exist){
                mensaje = "We found your password. Please check your e-mail.";  
                response.sendRedirect("message2.jsp");
            }else{
                mensaje = "Your mail doesn't exists... try again";                         
            response.sendRedirect("message.jsp");
            }            
        } catch (SQLException ex) {
            Logger.getLogger(ResetPasswordServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ResetPasswordServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ResetPasswordServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ResetPasswordServlet.class.getName()).log(Level.SEVERE, null, ex);
        }       
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = "forgetPassword.jsp";
        request.getRequestDispatcher("message.jsp").forward(request, response);

    }

}
