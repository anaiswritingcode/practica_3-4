package poo;

public class LibroFisico extends Libro {
  private Sala ubicacion;

  public LibroFisico(String titulo, String ISBN, String editorial, String idioma, int numPaginas, int anno, boolean estaDisponible, Sala ubicacion) {
    super(titulo, ISBN, editorial, idioma, numPaginas, anno, estaDisponible);
    this.ubicacion = ubicacion;
  }
}
