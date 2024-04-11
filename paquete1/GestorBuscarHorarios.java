package paquete1;

import java.util.ArrayList;

public class GestorBuscarHorarios {
    private final ArrayList<Horario> horarios;

    public GestorBuscarHorarios(ArrayList<Horario> horarios){
        this.horarios = horarios;
    }

    public Horario buscarHorario(String hora_inicio, String hora_final, String aula){
        for (Horario horario : horarios){
            if(horario.getHora_inicio().equals(hora_inicio) && horario.getHora_final().equals(hora_final) && horario.getAula().equalsIgnoreCase(aula)) {
                return horario;
            }
        }
        return null;
    }

    public ArrayList<Horario> buscarHorariosPorDia(String dia_semana){
        ArrayList<Horario> horariosPorDia = new ArrayList<>();
        for (Horario horario : horarios) {
            if (horario.getDia_semana().equalsIgnoreCase(dia_semana)) {
                horariosPorDia.add(horario);
            }
        }
        return horariosPorDia;
    }

    public ArrayList<Horario> buscarHorariosPorAula(String aula) {
        ArrayList<Horario> horariosPorAula = new ArrayList<>();
        for (Horario horario : horarios) {
            if (horario.getAula().equalsIgnoreCase(aula)) {
                horariosPorAula.add(horario);
            }
        }
        return horariosPorAula;
    }
}
