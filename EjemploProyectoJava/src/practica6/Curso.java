package practica6;
import java.util.*;

public class Curso {
  private String codigo;
  private String nombre;
  private int cupoMaximo;
  private Departamento departamento;
  private List<Matricula> matriculas;
  private List<Horario> horarios = new ArrayList<>();

  // * Constructor:

  public Curso(String codigo, String nombre, int cupoMaximo, Departamento departamento) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.cupoMaximo = cupoMaximo;
    this.departamento = departamento;
    matriculas = new ArrayList<>();
  }
}