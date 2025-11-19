package practica6;
import java.util.*;

abstract class Persona {
  private String dni;
  private String nombre;
  private Date fechaNacimiento;
  private Direccion direccion;

  // * Constructor:

  public Persona(String dni, String nombre, Date fechaNacimiento, String calle, int numero, String ciudad) {
    this.dni = dni;
    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
    direccion = new Direccion(calle, numero, ciudad);
  }

  // * Otros métodos:

  public int getEdad() {
    // ...
  }
}
