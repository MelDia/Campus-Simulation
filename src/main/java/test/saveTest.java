package test;

import datos.UsuarioDAO;
import datos.UsuarioDAOImpl;
import domain.Usuario;

public class saveTest {
    public static void main(String[] args) {
        UsuarioDAO userdao = new UsuarioDAOImpl();
        Usuario user = new Usuario();
        
        user.setUsername("alejandrito");
        user.setPassword("12345");
        user.setEmail("comeoncr7@gmail.com");
        user.setName("alejandro");
        user.setLastname("glad");
        
        boolean flag = userdao.save(user);
        if ( flag ) {
            System.out.println("SE AGREGO");
        } else {
            System.out.println("NO SE AGREGO");
        }
    }
}
