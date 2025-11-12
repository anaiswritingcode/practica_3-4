package poo;

public class Main {
  public static void main(String[] args) throws Exception {
    // * Algunas variables para probar:

    Biblioteca biblioteca1 = new Biblioteca("Abeto", "Calle Trébol");
    Biblioteca bibliotecaCentral = new Biblioteca("Central", "Avenida del Sol");

    Sala sala1 = new SalaInformatica("Sala del Atún", "informática", 18);
    Sala sala2 = new SalaEstudio("Sala del Silencio", "estudio", 10);

    Libro libro1 = new LibroDigital("Aguas Rojas", "92027346-B", "Flota salvaje", "español", 128, 2019, true, "PDF", 25);
    Libro libro2 = new LibroFisico("Green Clouds", "28743278-B", "Pen&Paper", "inglés", 217, 2016, false, sala1);


    PersonaPOO persona1 = new Usuario("DD", 19, 0001);
    PersonaPOO persona2 = new Usuario("QS", 18, 0002);
    PersonaPOO persona3 = new Empleado("PF", 21, "jefe", 25000);
    PersonaPOO persona4 = new Empleado("PF", 20, "dependiente", 20000);

    // * Verificamos que funcionan los métodos:

    bibliotecaCentral.addLibro(libro1);
    bibliotecaCentral.addLibro(libro2);
    bibliotecaCentral.addSala(sala1);
    bibliotecaCentral.addSala(sala2);
    bibliotecaCentral.registrarVisita(persona1);
    bibliotecaCentral.registrarVisita(persona2);
    bibliotecaCentral.asignarResponsable(sala1, persona3);
    bibliotecaCentral.asignarResponsable(sala2, persona4);

    sala1.entrarPersona(persona1);
    sala1.entrarPersona(persona2);

    libro1.mostrarInfo();
    bibliotecaCentral.esExtranjero(libro1);
    bibliotecaCentral.mostrarBiblioteca();
    bibliotecaCentral.buscarLibroPorTitulo("Aguas Rojas");

    sala1.mostrarPersonas();
    System.out.println("\n" + sala1.getNumPersonas() + ", " + sala1.getDisponibilidad());
    System.out.println(sala2.getNumPersonas() + ", " + sala2.getDisponibilidad());
    bibliotecaCentral.mostrarSalasDisponibles();
    bibliotecaCentral.mostrarPersonasTotal();
  }
}
