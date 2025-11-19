package practica6;
import java.util.*;

public class Curso {
  String codigo;
  String nombre;
  int cupoMaximo;
  Departamento departamento;
  List<Matricula> matriculas;
  List<Horario> horarios = new ArrayList<>();

  public Curso(String codigo, String nombre, int cupoMaximo, Departamento departamento) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.cupoMaximo = cupoMaximo;
    this.departamento = departamento;
    matriculas = new ArrayList<>();
  }
}