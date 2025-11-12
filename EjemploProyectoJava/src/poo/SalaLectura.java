package poo;

import java.util.*;

public class SalaLectura extends Sala {
  private List<Libro> listaLibros;

  public SalaLectura(String nombre, String tipo) {
    super(nombre, tipo);
    this.listaLibros = new ArrayList<>();
  }
}
