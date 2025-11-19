package practica6;
import java.util.*;

public class Matricula {
  private Date fecha;
  private double notaFinal;
  private Curso curso;
  private Estudiante estudiante;

  // * Constructor:

  public Matricula(Date fecha, Estudiante estudiante, Curso curso) {
    this.fecha = fecha;
    this.notaFinal = 0; // Por ahora la inicializamos así.
    this.curso = curso;
    this.estudiante = estudiante;
  }


  // * Otros métodos:

  public double calcularNotaFinal() {
    // ...
  }
}
