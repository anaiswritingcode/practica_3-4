package practica6;
import java.util.*;

public class Profesor extends Persona {
  double salario;
  List<Curso> cursos = new ArrayList<>();

  public Profesor(String dni, String nombre, Date fechaNacimiento, Direccion direccion, double salario) {
    super(dni, nombre, fechaNacimiento, direccion);
    this.salario = salario;
  }
}
