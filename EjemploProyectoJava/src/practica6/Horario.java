package practica6;
import java.sql.Time;

public class Horario {
  String diaSemana;
  Time horaInicio;
  Time horaFin;

  public Horario(String diaSemana, Time horaInicio, Time horaFin) {
    this.diaSemana = diaSemana;
    this.horaInicio = horaInicio;
    this.horaFin = horaFin;
  }
}
