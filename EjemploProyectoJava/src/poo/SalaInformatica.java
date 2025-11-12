package poo;

public class SalaInformatica extends Sala {
  private int numEquipos;

  public SalaInformatica(String nombre, String tipo, int numEquipos) {
    super(nombre, tipo);
    this.numEquipos = numEquipos;
  }
}
