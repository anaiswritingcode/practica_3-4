package poo;

public class PersonaPOO {
  // * Definición de atributos de la persona:
  private String nombre;
  int edad;
  private String direccion;
  private String apellidos;
  private String DNI;
  private String email;
  private String telefono;
  private String profesion;
  int annosExperiencia;

  // * Definición del comportamiento de la persona:
  public PersonaPOO(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
    this.apellidos = "Apellido 1 Apellido 2"; // Lo establecería por defecto a no ser que el setter lo sobreescriba.
  }

  // * Dar una dirección a la persona:
  public void setDireccion(String direccion) { // public para que se pueda usar tanto en este fichero como fuera, y void porque solo añadimos y no esperamos nada de vuelta.
    this.direccion = direccion;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }
  public void setDNI(String DNI) {
    this.DNI = DNI;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
  public void setProfesion(String profesion) {
    this.profesion = profesion;
  }
  public void setAnnosExperiencia(int annosExperiencia) {
    this.annosExperiencia = annosExperiencia;
  }

  public int getEdad() {
    return this.edad;
  }
  public String getApellidos() {
    return this.apellidos;
  }
  public String getDNI() {
    return this.DNI;
  }
  public String getEmail() {
    return this.email;
  }
  public String getTelefono() {
    return this.telefono;
  }
  public String getProfesion() {
    return this.profesion;
  }
  public int getAnnosExperiencia() {
    return this.annosExperiencia;
  }

  // * Para mostrar información básica de una persona:
  public void mostrarInfo() {
    System.out.println("\nNombre: " + this.nombre + ". Apellidos: " + this.apellidos + ". Edad: " + this.edad + ". Dirección: " + this.direccion + ". DNI: " + this.DNI + ". Email: " + this.email + ". Teléfono: " + this.telefono + ". Profesión: " + this.profesion + ". Años de experiencia: " + this.annosExperiencia + ".");
  }

  // * Para ver si una persona está jubilada:
  public boolean estaJubilado() {
    if (this.edad > 65) {
      System.out.println("\nLa persona " + this.nombre + " está jubilada.");
      return true;
    } else if (this.edad < 65 && this.edad > 16) {
      System.out.println("\nLa persona " + this.nombre + " está en edad de trabajar.");
      return false;
    } else {
      System.out.println("\nLa persona " + this.nombre + " no tiene edad ni de trabajar ni de jubilarse.");
      return false;
    }
  }
}