package paquete1;
import java.util.ArrayList;

public class GestorCursos {
    private final ArrayList<Cursos> cursos;


    public GestorCursos() {
        this.cursos = new ArrayList<>();
    }

   public void agregar_curso(Cursos curso, Usuario usuario ) {
        if (usuario instanceof Administrativo) {
            cursos.add(curso);
            System.out.println("El curso ha sido creado con exito!");
        } else {
            System.out.println("Solo los Administrativos pueden agregar cursos.");
        }
   }
   public void listarCursos() {
        System.out.println("Cursos disponibles: ");
        for (Cursos cursos : cursos) {
            System.out.println(cursos.getNombre());
        }
   }
}




