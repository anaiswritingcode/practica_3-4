package poo;

public class Sala {
  private String nombre;
  private String tipo;
  private int capacidad;
  private boolean tienePizarra;
  private boolean estaDisponible;

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
  public boolean getPizarra() {
    return this.tienePizarra;
  }
  public boolean getDisponibilidad() {
    return this.estaDisponible;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public void setTipo(String tipo) {
    if (tipo.equals("estudio") || tipo.equals("lectura") || tipo.equals("infantil")) {
      this.tipo = tipo;
    } else {
      System.out.println("Tipo de sala no admitido.");
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

  public void estaDisponible() {
    if (this.estaDisponible) {
      System.out.println("La sala se encuentra disponible para su reserva.");
    } else {
      System.out.println("La sala no se encuentra disponible.");
    }
  }

  public void tienePizarra() {
    if (this.tienePizarra) {
      System.out.println("La sala dispone de pizarra.");
    } else {
      System.out.println("La sala no dispone de pizarra.");
    }
  }

  public void informacion() {
    System.out.println("Sala: " + this.nombre + " - " + this.capacidad + ". Se utiliza para " + this.tipo + ".");
    tienePizarra();
    estaDisponible();
  }
}
