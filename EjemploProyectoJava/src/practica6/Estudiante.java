package practica6;
import java.util.*;

public class Estudiante extends Persona {
  boolean repetidor;
  Matricula matricula;

  public Estudiante(String dni, String nombre, Date fechaNacimiento, Direccion direccion, boolean repetidor) {
    super(dni, nombre, fechaNacimiento, direccion);
    this.repetidor = repetidor;
  }
}
