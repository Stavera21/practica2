package paquete1;

import java.util.Map;

public class AutenticadorUsuarios {
    private final Map<String, Usuario> usuariosRegistrados;

    public AutenticadorUsuarios(Map<String, Usuario> usuariosRegistrados){
        this.usuariosRegistrados = usuariosRegistrados;
    }

    public boolean autenticarUsuario(String correo){
        Usuario usuario = usuariosRegistrados.get(correo);
        if (usuario != null){
            return true;
        }
        return false;
    }
}
