package poo;

public class Main {
  public static void main(String[] args) throws Exception {
    // * Algunas variables para probar:
    Biblioteca biblioteca1 = new Biblioteca("Abeto", "Calle Trébol");
    Libro libro1 = new Libro("Aguas Rojas", "92027346-B", "Flota salvaje", "español", 128, 2019, true);
    Libro libro2 = new Libro("Green Clouds", "28743278-B", "Pen&Paper", "inglés", 217, 2016, false);

    // * Verificamos que funcionan los métodos del ejercicio 2.a.i:
    biblioteca1.addLibro(libro1);
    biblioteca1.addLibro(libro2);
    biblioteca1.esExtranjero(libro1);
    biblioteca1.mostrarBiblioteca();
    biblioteca1.buscarLibroPorTitulo("Aguas Rojas");
  }
}
