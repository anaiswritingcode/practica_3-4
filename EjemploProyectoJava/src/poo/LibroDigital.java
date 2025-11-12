package poo;

public class LibroDigital extends Libro {
  private String formato;
  private double tamannoMB;

  public LibroDigital(String titulo, String ISBN, String editorial, String idioma, int numPaginas, int anno, boolean estaDisponible, String formato, double tamannoMB) {
    super(titulo, ISBN, editorial, idioma, numPaginas, anno, estaDisponible);
    this.formato = formato;
    this.tamannoMB = tamannoMB;
  }
}
