package practica6;
import java.util.*;

abstract class Persona {
  String dni;
  String nombre;
  Date fechaNacimiento;
  Direccion direccion;

  public Persona(String dni, String nombre, Date fechaNacimiento, Direccion direccion) {
    this.dni = dni;
    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
    this.direccion = direccion;
  }
}
