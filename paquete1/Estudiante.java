package paquete1;


import java.util.ArrayList;
import java.util.HashMap;

public class Estudiante extends Usuario {
    private final ArrayList<Cursos> cursos;
    private final HashMap<Cursos, Notas> notas;

    public Estudiante(String nombre, String apellido, String correo, String tipo_usuario) {
        super(nombre, apellido, correo, tipo_usuario);
        this.cursos = new ArrayList<>();
        this.notas = new HashMap<>();
    }

    public void inscribir_curso(Cursos curso) {
        cursos.add(curso);
        notas.put(curso, new Notas(this, 0.0));
    }

    public ArrayList<Cursos> getCursos() {
        return cursos;
    }


}
