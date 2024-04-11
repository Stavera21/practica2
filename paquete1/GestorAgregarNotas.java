package paquete1;

import java.util.ArrayList;

public class GestorAgregarNotas {
    private final ArrayList<Notas> listaNotas;

    public GestorAgregarNotas() {
        this.listaNotas = new ArrayList<>();
    }

    public void agregarNota(Notas nota) {
        listaNotas.add(nota);
    }

    public void listarNotas() {
        System.out.println("Horarios agregados: ");
        for (Notas nota : listaNotas) {
            System.out.println(listaNotas);
        }
    }
}
