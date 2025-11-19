package practica6;
import java.util.*;

public class Estudiante extends Persona {
  boolean repetidor;

  public Estudiante(String dni, String nombre, Date fechaNacimiento, boolean repetidor) {
    super(dni, nombre, fechaNacimiento);
    this.repetidor = repetidor;
  }
}
