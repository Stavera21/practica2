package paquete1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de gestión educativa");

        // Crear usuarios
        System.out.println("\nCreación de usuarios!");
        Usuario usuario = crearUsuarioDesdeConsola(scanner);
        if (usuario != null) {
            System.out.println("Usuario creado con éxito:");
            System.out.println("Nombre: " + usuario.get_Nombre());
            System.out.println("Apellido: " + usuario.get_Apellido());
            System.out.println("Correo: " + usuario.get_Correo());
            System.out.println("Tipo de usuario: " + usuario.get_Tipo_usuario());

            // Operaciones adicionales según el tipo de usuario
            switch (usuario.get_Tipo_usuario().toLowerCase()) {
                case "estudiante":
                    operacionesEstudiante((Estudiante) usuario, scanner);
                    break;
                case "profesor":
                    operacionesProfesor((Profesor) usuario, scanner);
                    break;
                case "administrativo":
                    operacionesAdministrativo((Administrativo) usuario, scanner);
                    break;
                default:
                    System.out.println("Tipo de usuario no válido.");
                    break;
            }
        }
    }

    private static Usuario crearUsuarioDesdeConsola(Scanner scanner) {
        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del usuario: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese el correo electrónico del usuario: ");
        String correo = scanner.nextLine();
        System.out.print("Ingrese el tipo de usuario (Estudiante/Profesor/Administrativo): ");
        String tipoUsuario = scanner.nextLine();

        Usuario usuario = null;
        switch (tipoUsuario.toLowerCase()) {
            case "estudiante":
                usuario = new Estudiante(nombre, apellido, correo, tipoUsuario);
                break;
            case "profesor":
                usuario = new Profesor(nombre, apellido, correo, tipoUsuario);
                break;
            case "administrativo":
                usuario = new Administrativo(nombre, apellido, correo, tipoUsuario);
                break;
            default:
                System.out.println("Tipo de usuario no válido.");
                break;
        }
        return usuario;
    }

    private static void operacionesEstudiante(Estudiante estudiante, Scanner scanner) {
        // Inscribe al estudiante en un curso
        System.out.println("\nInscripción en curso...");
        Cursos curso = crearCursoDesdeConsola(scanner);
        if (curso != null) {
            estudiante.inscribir_curso(curso);
            System.out.println("Estudiante inscrito en el curso " + curso.getNombre());
        }

        // Consulta de notas
        System.out.println("\nConsulta de notas...");
        System.out.print("Ingrese el código del curso para consultar las notas: ");
        String codigoCurso = scanner.nextLine();
        for (Cursos c : estudiante.getCursos()) {
            if (c.getCodigo().equalsIgnoreCase(codigoCurso)) {
                Notas notas = new Notas(estudiante, 0.0); // Crear una instancia de Notas con datos temporales
                System.out.println("Nota del estudiante en el curso " + c.getNombre() + ": " + notas.getNota());
                break;
            }
        }
    }

    private static void operacionesProfesor(Profesor profesor, Scanner scanner) {
        // Agrega un curso
        System.out.println("\nCreación de curso...");
        Cursos curso = crearCursoDesdeConsola(scanner);
        if (curso != null) {
            GestorCursos gestorCursos = new GestorCursos();
            gestorCursos.agregar_curso(curso, profesor);
            System.out.println("Curso agregado con éxito");
        }
    }

    private static void operacionesAdministrativo(Administrativo administrativo, Scanner scanner) {
        // Agrega un curso
        System.out.println("\nCreación de curso...");
        Cursos curso = crearCursoDesdeConsola(scanner);
        if (curso != null) {
            GestorCursos gestorCursos = new GestorCursos();
            gestorCursos.agregar_curso(curso, administrativo);
            System.out.println("Curso agregado con éxito");
        }
    }

    private static Cursos crearCursoDesdeConsola(Scanner scanner) {
        System.out.print("Ingrese el nombre del curso: ");
        String nombreCurso = scanner.nextLine();
        System.out.print("Ingrese el código del curso: ");
        String codigoCurso = scanner.nextLine();

        return new Cursos(nombreCurso, codigoCurso);
    }
}
