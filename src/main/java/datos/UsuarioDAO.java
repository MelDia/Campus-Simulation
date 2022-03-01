package datos;

import domain.Usuario;

public interface UsuarioDAO {
    public void save(Usuario usuario);
    public boolean checkLogin(String username, String password);
    public boolean userExist(String username);
}
