package practica6;
import java.util.*;

public class Universidad {
  private String nombre;
  private List<Departamento> departamentos;

  // * Constructor:

  public Universidad(String nombre) {
    this.nombre = nombre;
    departamentos = new ArrayList<>();
  }
}
