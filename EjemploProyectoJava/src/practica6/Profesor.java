package practica6;
import java.util.*;

public class Profesor extends Persona {
  private double salario;
  private List<Curso> cursos = new ArrayList<>();

  // * Constructor:

  public Profesor(String dni, String nombre, Date fechaNacimiento, Direccion direccion, double salario) {
    super(dni, nombre, fechaNacimiento, direccion);
    this.salario = salario;
  }
}
