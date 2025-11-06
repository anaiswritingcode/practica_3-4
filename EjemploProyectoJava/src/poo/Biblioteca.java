package poo;
import java.util.*;

public class Biblioteca {
  private String nombre;
  private String direccion;
  private int horaApertura;
  private int horaCierre;
  private List<Libro> libros;
  private List<Sala> salas;

  public Biblioteca(String nombre, String direccion) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.horaApertura = 9;
    this.horaCierre = 22;
  }

  // * Para añadir/eliminar libros:
  public void addLibro(Libro libro) {
    libros.add(libro);
  }
  public void removeLibro(Libro libro) {
    libros.remove(libro);
  }

  // * Para añadir/eliminar salas:
  public void addSala(Sala sala) {
    salas.add(sala);
  }
  public void removeSala(Sala sala) {
    salas.remove(sala);
  }

  // * Para ver si la biblioteca está abierta:
  public boolean estaAbierta(int hora) {
    if (hora >= 9 && hora < 22) {
      System.out.println("\nLa biblioteca " + this.nombre + " está abierta.");
      return true;
    } else {
      System.out.println("\nLa biblioteca " + this.nombre + " no está abierta.");
      return false;
    }
  }

  // * Para ver si un libro está en un idioma distinto al español:
  public boolean esExtranjero(String idioma) {
    if (!idioma.equalsIgnoreCase("español")) {
      System.out.println("El libro está escrito en " + idioma + ".");
      return true;
    } else {
      System.out.println("El libro está en español.");
      return false;
    }
  }

  // * Para mostrar información de la biblioteca:
  public void informacion() {
    System.out.println("Biblioteca: " + this.nombre + " - " + this.direccion + ". Abierto de " + this.horaApertura + " a " + this.horaCierre + ".");
  }
}
