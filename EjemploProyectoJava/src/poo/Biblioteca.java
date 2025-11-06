package poo;
import java.util.*;

public class Biblioteca {
  private String nombre;
  private String direccion;
  private int horaApertura;
  private int horaCierre;
  private List<Libro> libros = new ArrayList<>();
  private List<Sala> salas = new ArrayList<>();

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
  public boolean esExtranjero(Libro libro) {
    if (!libro.getIdioma().equalsIgnoreCase("español")) {
      System.out.println("El libro " + libro.getTitulo() + " está escrito en " + libro.getIdioma() + ".");
      return true;
    } else {
      System.out.println("El libro " + libro.getTitulo() + " está en español.");
      return false;
    }
  }

  // * Para mostrar información de la biblioteca:
  public void informacion() {
    System.out.println("Biblioteca: " + this.nombre + " - " + this.direccion + ". Abierto de " + this.horaApertura + " a " + this.horaCierre + ".");
  }

  // * Para mostrar los libros y salas disponibles:
  public void mostrarBiblioteca() {
    if (libros.isEmpty()) { // Si no hay libros lo notificamos.
      System.out.println("\nNo se han añadido libros.");
    } else {
      System.out.println("\nLibros de la biblioteca " + this.nombre + ":");

      int contadorLibros = 1;
      for (Libro libro : libros) {
        System.out.print(contadorLibros + ". "); // Mostramos una lista numérica.
        System.out.println(libro.getTitulo() + ".");

        contadorLibros++;
      }
    }

    if (salas.isEmpty()) { // Si no hay salas lo notificamos.
      System.out.println("\nNo se han añadido salas.");
    } else {
      System.out.println("\nSalas de la biblioteca " + this.nombre + ":");

      int contadorSalas = 1;
      for (Sala sala : salas) {
        System.out.print(contadorSalas + ". "); // Mostramos una lista numérica.
        System.out.println(sala.getNombre() + ".");

        contadorSalas++;
      }
    }
  }

  // * Para ver si existen libros buscando por su título:
  public String buscarLibroPorTitulo(String titulo) {
    for (Libro libro : libros) {
      if (libro.getTitulo().equalsIgnoreCase(titulo)) {
        System.out.println("El libro " + libro.getTitulo() + " se encuentra en la biblioteca " + this.nombre + ".");
        return libro.getTitulo();
      }
    }
    
    System.out.println("El libro " + titulo + "no se ha encontrado en la biblioteca " + this.nombre + ".");
    return null;
  }
}
