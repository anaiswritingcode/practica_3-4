package poo;
import java.util.*;

public class Sala {
  private String nombre;
  private String tipo;
  private int capacidad;
  private boolean tienePizarra;
  private boolean estaDisponible;
  private List<PersonaPOO> personas = new ArrayList<>();

  public Sala(String nombre, String tipo) {
    this.nombre = nombre;
    this.tipo = tipo;
    this.capacidad = 30;
    this.tienePizarra = true;
    this.estaDisponible = true;
  }

  public String getNombre() {
    return this.nombre;
  }
  public String getTipo() {
    return this.tipo;
  }
  public int getCapacidad() {
    return this.capacidad;
  }
  public int getNumPersonas() {
    return this.personas.size();
  }
  public boolean getPizarra() {
    return this.tienePizarra;
  }
  public boolean getDisponibilidad() {
    return this.estaDisponible;
  }

  public void entrarPersona(PersonaPOO persona) {
    if (this.personas.size() < this.capacidad) {
      this.personas.add(persona);
      this.estaDisponible = false;
    } else {
      System.out.println("\nLa sala " + this.nombre + " está llena, ya no pueden entrar más personas.");
    }
  }
  public void salirPersona(PersonaPOO persona) {
    this.personas.remove(persona);
    if (this.personas.isEmpty()) {
      this.estaDisponible = true;
    }
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public void setTipo(String tipo) {
    if (tipo.equals("estudio") || tipo.equals("lectura") || tipo.equals("infantil")) {
      this.tipo = tipo;
    } else {
      System.out.println("\nTipo de sala no admitido.");
      this.tipo = null;
    }
  }
  public void setCapacidad(int capacidad) {
    this.capacidad = capacidad;
  }
  public void setPizarra(boolean tienePizarra) {
    this.tienePizarra = tienePizarra;
  }
  public void setDisponibilidad(boolean estaDisponible) {
    this.estaDisponible = estaDisponible;
  }

  // * Para ver si una sala está disponible:
  public void estaDisponible() {
    if (this.estaDisponible) {
      System.out.println("\nLa sala se encuentra disponible para su reserva.");
    } else {
      System.out.println("\nLa sala no se encuentra disponible.");
    }
  }

  // * Para ver si una sala tiene pizarra:
  public void tienePizarra() {
    if (this.tienePizarra) {
      System.out.println("\nLa sala dispone de pizarra.");
    } else {
      System.out.println("\nLa sala no dispone de pizarra.");
    }
  }

  // * Para mostrar información sobre una sala:
  public void mostrarInfo() {
    System.out.println("\nSala: " + this.nombre + " - " + this.capacidad + ". Se utiliza para " + this.tipo + ".");
    tienePizarra();
    estaDisponible();
  }

  // * Para mostrar el número de personas en una sala:
  public void mostrarPersonas() {
    System.out.println("\nNúmero de personas en la sala " + this.nombre + ": " + this.personas.size() + ".");
}
}
