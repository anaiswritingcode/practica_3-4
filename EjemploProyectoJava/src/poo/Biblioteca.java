package poo;
import java.util.*;

public class Biblioteca {
  private String nombre;
  private String direccion;
  private int horaApertura;
  private int horaCierre;
  private List<Libro> libros = new ArrayList<>();
  private List<Sala> salas = new ArrayList<>();
  private List<PersonaPOO> personas = new ArrayList<>();

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
      System.out.println("\nEl libro " + libro.getTitulo() + " está escrito en " + libro.getIdioma() + ".");
      return true;
    } else {
      System.out.println("\nEl libro " + libro.getTitulo() + " está en español.");
      return false;
    }
  }

  // * Para mostrar información de la biblioteca:
  public void mostrarInfo() {
    System.out.println("\nBiblioteca: " + this.nombre + " - " + this.direccion + ". Abierto de " + this.horaApertura + " a " + this.horaCierre + ".");
    mostrarSalasDisponibles();
    mostrarBiblioteca();

    int contadorPersonas = 1;
    for (PersonaPOO persona : personas) {
      System.out.println(contadorPersonas + ". "); // Mostramos una lista numérica.
      System.out.println(persona.getNombre() + ".");
    }
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
        System.out.println("\nEl libro " + libro.getTitulo() + " se encuentra en la biblioteca " + this.nombre + ".");
        return libro.getTitulo();
      }
    }
    
    System.out.println("\nEl libro " + titulo + "no se ha encontrado en la biblioteca " + this.nombre + ".");
    return null;
  }

  // * Para mostrar las salas disponibles:
  public void mostrarSalasDisponibles() {
    int contadorSalas = 1;
    boolean hayDisponibles = false; // Lo dejamos así de forma predeterminada hasta que se demuestre lo contrario.

    System.out.println("\nSalas disponibles en la biblioteca " + this.nombre + ":");

    for (Sala sala : salas) {
      if (sala.getDisponibilidad()) {
        System.out.println(contadorSalas + ". " + sala.getNombre() + "."); // Mostramos una lista numérica.
        
        contadorSalas++;
        hayDisponibles = true;
      }
    }

    if (!hayDisponibles) {
      System.out.println("\nNo hay salas disponibles en la biblioteca " + this.nombre + ".");
    }
  }

  // * Para mostrar el número de personas total, contando todas las salas:
  public void mostrarPersonasTotal() {
    int numPersonasTotal = 0;

    for (Sala sala : salas) {
      numPersonasTotal += sala.getNumPersonas();
    }

    System.out.println("\nNúmero total de personas en la biblioteca " + this.nombre + ": " + numPersonasTotal + ".");
  }

  // * Para registrar visitas:
  public void registrarVisita(PersonaPOO persona) {
    System.out.println("\nPersona que entra: " + persona.getNombre() + ".");
  }

  // * Para asignar como responsable a una persona:
  public void asignarResponsable(Sala sala, PersonaPOO persona) {
    sala.setPersonaResponsable(persona);
  }
}
