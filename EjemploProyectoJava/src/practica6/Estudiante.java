package practica6;
import java.util.*;

public class Estudiante extends Persona {
  private boolean repetidor;
  private Matricula matricula;

  // * Constructor:
  
  public Estudiante(String dni, String nombre, Date fechaNacimiento, Direccion direccion, boolean repetidor) {
    super(dni, nombre, fechaNacimiento, direccion);
    this.repetidor = repetidor;
  }
}
