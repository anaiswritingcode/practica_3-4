package poo;

public class Main {
  public static void main(String[] args) throws Exception {
    // * Algunas variables para probar:
    Biblioteca biblioteca1 = new Biblioteca("Abeto", "Calle Trébol");
    Libro libro1 = new Libro("Aguas Rojas", "92027346-B", "Flota salvaje", "español", 128, 2019, true);
    Libro libro2 = new Libro("Green Clouds", "28743278-B", "Pen&Paper", "inglés", 217, 2016, false);
    Sala sala1 = new Sala("Sala del Atún", "infantil");
    Sala sala2 = new Sala("Sala del Silencio", "estudio");
    PersonaPOO persona1 = new PersonaPOO("DD", 19);
    PersonaPOO persona2 = new PersonaPOO("QS", 18);
    PersonaPOO persona3 = new PersonaPOO("PF", 21);

    // * Verificamos que funcionan los métodos:

    biblioteca1.addLibro(libro1);
    biblioteca1.addLibro(libro2);
    biblioteca1.addSala(sala1);
    biblioteca1.addSala(sala2);
    sala1.entrarPersona(persona1);
    sala1.entrarPersona(persona2);
    sala1.entrarPersona(persona3);

    biblioteca1.esExtranjero(libro1);
    biblioteca1.mostrarBiblioteca();
    biblioteca1.buscarLibroPorTitulo("Aguas Rojas");

    sala1.mostrarPersonas();
    System.out.println("\n" + sala1.getNumPersonas() + ", " + sala1.getDisponibilidad());
    System.out.println(sala2.getNumPersonas() + ", " + sala2.getDisponibilidad());
    biblioteca1.mostrarSalasDisponibles();
    biblioteca1.mostrarPersonasTotal();
  }
}
