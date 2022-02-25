package domain;

public class Usuario {
    private int idUsuario;
    private String username;
    private String password;
    private String email;
    private String name;
    private String lastname;

    public Usuario() {
    }

    public Usuario(int idUsuario, String username, String password, String email, String name, String lastname) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.lastname = lastname;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }       

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Usuario{" 
                + "idUsuario:" + idUsuario 
                + ", username:" + username 
                + ", password:" + password 
                + ", email:" + email
                + ", name:" + name 
                + ", lastname:" + lastname + '}';
    }
    
    

       
    
    
}
