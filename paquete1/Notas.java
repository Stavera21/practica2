package paquete1;

import java.util.HashMap;

public class Notas {
    private Estudiante estudiante;
    private double nota;

    public Notas(Estudiante estudiante, double nota) {
        this.estudiante = estudiante;
        this.nota = nota;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public double getNota() {
        return nota;
    }

    public void SetNota(double nota) {
        this.nota = nota;
    }

    public static void obtenerEstudiantes(HashMap<Estudiante, Double> notas) {
        for (Estudiante estudiante : notas.keySet()) {
            System.out.println(estudiante.get_Nombre());
        }
    }
}