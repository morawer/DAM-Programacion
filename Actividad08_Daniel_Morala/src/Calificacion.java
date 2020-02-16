
public class Calificacion {

	private String asignatura;
	private int nota;

	public Calificacion(String asignatura, int nota) {
		super();
		this.asignatura = asignatura;
		this.nota = nota;
	}

	public Calificacion() {
		super();
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override

	public String toString() {

		return getAsignatura() + ": " + getNota();

	}

}
