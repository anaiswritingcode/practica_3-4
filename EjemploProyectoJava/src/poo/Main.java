package poo;

public class Main {
  public static void main(String[] args) throws Exception {
    PersonaPOO persona1 = new PersonaPOO("Juan", 22);
    PersonaPOO persona2 = new PersonaPOO("Jorge", 19);

    persona1.setDireccion("Calle Luna");
    persona2.setDireccion("Avenida del Ejército");

    persona1.setApellidos("García");
    persona2.setApellidos("Sánchez");

    persona1.setDNI("19286384H");
    persona1.setDNI("38246817H");

    persona1.setEmail("juangarcia@gmail.com");
    persona1.setEmail("jorgesanchez@gmail.com");

    persona1.setTelefono("+34 687234166");
    persona2.setTelefono("+34 623187634");

    persona1.setProfesion("Limpiador");
    persona1.setProfesion("Carpintero");

    persona1.setAnyosExperiencia(2);
    persona2.setAnyosExperiencia(0);

    persona1.mostrarInformacion();
    persona2.mostrarInformacion();

    persona1.estaJubilado();
    persona2.estaJubilado();

    System.out.println("\nLa persona 1 sabemos que tiene " + persona1.getEdad() + " años y " + persona1.getAnyosExperiencia() + " de experiencia.");


    Biblioteca biblioteca1 = new Biblioteca("Roble", "Avenida del Ejército");

    biblioteca1.estaAbierta(15);
    biblioteca1.esExtranjero("inglés");
    biblioteca1.informacion();

    System.out.println("");

    Sala sala1 = new Sala("Abeto", "estudio");

    sala1.informacion();
  }
}
