package datos;

import domain.Usuario;

public interface UsuarioDAO {
    public boolean save(Usuario usuario);
    public boolean checkLogin(String username, String password);
    
}
