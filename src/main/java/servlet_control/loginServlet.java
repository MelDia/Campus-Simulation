package servlet_control;

import datos.UsuarioDAO;
import datos.UsuarioDAOImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UsuarioDAO userdao = new UsuarioDAOImpl();

        boolean flag = userdao.checkLogin(username, password);
        
        if (flag) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            response.sendRedirect("loginSucceed.jsp");
        } else {
            response.sendRedirect("loginFailed.jsp");
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
