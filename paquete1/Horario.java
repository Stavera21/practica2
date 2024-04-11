package paquete1;

public class Horario {

    private String dia_semana;
    private String hora_inicio;
    private String hora_final;
    private String aula;

    public Horario(String dia_semana, String hora_inicio, String hora_final, String aula) {

        this.dia_semana = dia_semana;
        this.hora_inicio = hora_inicio;
        this.hora_final = hora_final;
        this.aula = aula;
    }

    public String getDia_semana() {
        return dia_semana;
    }

    public void setDia_semana(String dia_semana){
        this.dia_semana = dia_semana;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_final() {
        return hora_final;
    }

    public void setHora_final(String hora_final)  {
        this.hora_final = hora_final;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
}
