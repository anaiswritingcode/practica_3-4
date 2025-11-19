package practica6;
import java.util.*;

public class Estudiante extends Persona {
  private boolean repetidor;
  private Matricula matricula;

  // * Constructor:
  
  public Estudiante(String dni, String nombre, Date fechaNacimiento,  String calle, int numero, String ciudad, boolean repetidor) {
    super(dni, nombre, fechaNacimiento, calle, numero, ciudad);
    this.repetidor = repetidor;
  }

  // * Otros métodos:

  public Matricula inscribirse(Curso curso) {
    // ...
  }
}
