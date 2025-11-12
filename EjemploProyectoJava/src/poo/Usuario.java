package poo;

import java.util.*;

public class Usuario extends PersonaPOO {
  private int numSocio;
  private List<Libro> listaLibrosPrestados;

  public Usuario(String nombre, int edad, int numSocio) {
    super(nombre, edad);
    this.numSocio = numSocio;
    this.listaLibrosPrestados = new ArrayList<>();
  }
}
