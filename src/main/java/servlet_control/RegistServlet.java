package servlet_control;

import datos.UsuarioDAO;
import datos.UsuarioDAOImpl;
import domain.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registServlet")
public class RegistServlet extends HttpServlet{
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("utf-8");
       response.setCharacterEncoding("utf-8");
       
       String username = request.getParameter("username");
       String password = request.getParameter("password");
       String email = request.getParameter("email");
       String name = request.getParameter("name");
       String lastname = request.getParameter("lastname");
       
       UsuarioDAO userdao = new UsuarioDAOImpl();
       Usuario user = new Usuario();
       
       user.setUsername(username);
       user.setPassword(password);
       user.setEmail(email);
       user.setName(name);
       user.setLastname(lastname);
       
       boolean flag = userdao.save(user);
       if( flag ) {
           response.sendRedirect("login.jsp");
       } else {
           response.sendRedirect("register.jsp");
       }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
