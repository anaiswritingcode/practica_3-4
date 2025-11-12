package poo;

public class SalaEstudio extends Sala {
  private int numMesas;

  public SalaEstudio(String nombre, String tipo, int numMesas) {
    super(nombre, tipo);
    this.numMesas = numMesas;
  }
}
