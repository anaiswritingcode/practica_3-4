package poo;

public class Libro {
  private String titulo;
  private String ISBN;
  private String editorial;
  private String idioma;
  private int numPaginas;
  private int anno;
  private boolean estaDisponible;

  public Libro(String titulo, String ISBN, String editorial, String idioma, int numPaginas, int anno, boolean estaDisponible) {
    this.titulo = titulo;
    this.ISBN = ISBN;
    this.editorial = editorial;
    this.idioma = idioma;
    this.numPaginas = numPaginas;
    this.anno = anno;
    this.estaDisponible = estaDisponible;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }
  public void seteditorial(String editorial) {
    this.editorial = editorial;
  }
  public void setIdioma(String idioma) {
    this.idioma = idioma;
  }
  public void setNumPaginas(int numPaginas) {
    this.numPaginas = numPaginas;
  }
  public void setAnno(int anno) {
    this.anno = anno;
  }
  public void setDisponibilidad(boolean estaDisponible) {
    this.estaDisponible = estaDisponible;
  }

  public String getTitulo() {
    return this.titulo;
  }
  public String getISBN() {
    return this.ISBN;
  }
  public String getEditorial() {
    return this.editorial;
  }
  public String getIdioma() {
    return this.idioma;
  }
  public int getNumPaginas() {
    return this.numPaginas;
  }
  public int getAnno() {
    return this.anno;
  }
  public boolean getDisponibilidad() {
    return this.estaDisponible;
  }

  // * Para ver si un libro se puede reservar:
  public void estaDisponible() {
    if (this.estaDisponible) {
      System.out.println("\nEl libro se encuentra disponible para su reserva.");
    } else {
      System.out.println("\nEl libro no se encuentra disponible.");
    }
  }

  // * Para mostrar información básica de un libro:
  public void mostrarInfo() {
    System.out.println("\nLibro: " + this.titulo + ". Editorial: " + this.editorial + ". Idioma: " + this.idioma + ". Año: " + this.anno + ".");
  }
}
