package paquete1;

import java.util.ArrayList;

public class GestorBuscarNotas {
    private final ArrayList<Notas> listaNotas;

    public GestorBuscarNotas(ArrayList<Notas> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public double buscarNota(Estudiante estudiante) {
        for (Notas nota : listaNotas) {
            if (nota.getEstudiante().equals(estudiante)) {
                return nota.getNota();
            }
        }
        return -1;
    }
}
