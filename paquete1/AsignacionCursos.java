package paquete1;

public class AsignacionCursos {
    private final Profesor profesor;
    private final Cursos cursos;

    public AsignacionCursos(Profesor profesor, Cursos cursos) {
        this.profesor = profesor;
        this.cursos = cursos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Cursos getCursos() {
        return cursos;
    }
}
