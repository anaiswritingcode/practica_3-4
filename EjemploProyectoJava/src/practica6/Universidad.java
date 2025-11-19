package practica6;
import java.util.*;

public class Universidad {
  String nombre;
  List<Departamento> departamentos;

  public Universidad(String nombre) {
    this.nombre = nombre;
    departamentos = new ArrayList<>();
  }
}
