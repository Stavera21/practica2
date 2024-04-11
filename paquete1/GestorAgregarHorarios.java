package paquete1;

import java.util.ArrayList;

public class GestorAgregarHorarios {
    private final ArrayList<Horario> horarios;

    public GestorAgregarHorarios(){
        this.horarios = new ArrayList<>();
    }

    public void agregarHorario(Horario horario) {
        horarios.add(horario);
    }

    public void listarHorarios() {
        System.out.println("Horarios agregados: ");
        for (Horario horario : horarios) {
            System.out.println(horario);
        }
    }
}
