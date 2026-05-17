package modelo;

public class Usuario {

    private int idUsuario;
    private String Usuario;
    private String Contrasena;
    private String Rol;

    public Usuario() {
    }

    public Usuario(String usuario,
                   String contrasena,
                   String rol) {

        this.Usuario = usuario;
        this.Contrasena = contrasena;
        this.Rol = rol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        this.Usuario = usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        this.Contrasena = contrasena;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        this.Rol = rol;
    }
}
