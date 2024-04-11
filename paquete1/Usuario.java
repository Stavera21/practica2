package paquete1;

public class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private String tipo_usuario;


    public Usuario(String nombre, String apellido, String coreo, String tipo_usuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = coreo;
        this.tipo_usuario = tipo_usuario;

    }


    public String get_Nombre() {
        return nombre;
    }

    public void set_Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String get_Apellido() {
        return apellido;
    }

    public void set_Apellido(String apellido) {
        this.apellido = apellido;
    }

    public String get_Correo() {
        return correo;
    }

    public void set_Correo(String correo) {
        this.correo = correo;
    }

    public String get_Tipo_usuario() {
        return tipo_usuario;
    }

    public void set_Tipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
}
