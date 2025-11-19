package practica6;
import java.util.*;

abstract class Persona {
  private String dni;
  private String nombre;
  private Date fechaNacimiento;
  private Direccion direccion;

  // * Constructor:

  public Persona(String dni, String nombre, Date fechaNacimiento, Direccion direccion) {
    this.dni = dni;
    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
    this.direccion = direccion;
  }

  // * Otros métodos:

  public int getEdad() {
    // ...
  }
}
