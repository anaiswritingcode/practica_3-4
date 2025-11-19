package practica6;
import java.util.*;

public class Profesor extends Persona {
  double salario;

  public Profesor(String dni, String nombre, Date fechaNacimiento, double salario) {
    super(dni, nombre, fechaNacimiento);
    this.salario = salario;
  }
}
