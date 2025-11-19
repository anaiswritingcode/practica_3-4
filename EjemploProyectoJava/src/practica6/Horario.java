package practica6;
import java.sql.Time;

public class Horario {
  private String diaSemana;
  private Time horaInicio;
  private Time horaFin;

  // * Constructor:

  public Horario(String diaSemana, Time horaInicio, Time horaFin) {
    this.diaSemana = diaSemana;
    this.horaInicio = horaInicio;
    this.horaFin = horaFin;
  }
}
