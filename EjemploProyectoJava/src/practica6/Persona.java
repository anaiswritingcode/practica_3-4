package practica6;
import java.util.*;

abstract class Persona {
  String dni;
  String nombre;
  Date fechaNacimiento;

  public Persona(String dni, String nombre, Date fechaNacimiento) {
    this.dni = dni;
    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
  }
}
