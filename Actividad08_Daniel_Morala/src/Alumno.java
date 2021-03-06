import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private int matricula;
	private ArrayList<Calificacion> calificaciones;

	public Alumno(String nombre, int matricula) {
		super();
		this.nombre = nombre;
		this.matricula = matricula;
		ArrayList<Calificacion> calificaciones = new ArrayList<Calificacion>();
		this.calificaciones = calificaciones;

	}

	public Alumno() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public int getMatricula() {
		return matricula;
	}

	public ArrayList<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void calificar(String asignatura, int nota) {

		this.calificaciones.add(new Calificacion(asignatura, nota));

	}

	@Override

	public String toString() {

		return "Alumno matricula: " + matricula + " - " + nombre;

	}

	public int notaMedia() {
		int nota = 0;

		for (Calificacion alum : calificaciones) {

			nota += alum.getNota();

		}
		nota = nota / calificaciones.size();

		return nota;
	}

}
