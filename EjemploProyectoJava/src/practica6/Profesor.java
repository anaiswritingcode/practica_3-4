package practica6;
import java.util.*;

public class Profesor extends Persona {
  private double salario;
  private List<Curso> cursos = new ArrayList<>();

  // * Constructor:

  public Profesor(String dni, String nombre, Date fechaNacimiento, String calle, int numero, String ciudad, double salario) {
    super(dni, nombre, fechaNacimiento, calle, numero, ciudad);
    this.salario = salario;
  }

  // * Otros métodos:

  public void asignarCurso(Curso curso) {
    // ...
  }
}
