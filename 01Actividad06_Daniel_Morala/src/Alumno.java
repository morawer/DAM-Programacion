
public class Alumno extends Persona{
	private String curso;
	
	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}
	
	public Alumno() {
		super();
	}
	
	//Este metodo es sobreescrito de la clase Persona y modificado.
	
	@Override
	public String toString() {
		return "Alumno = " + super.toString() + "Curso: " + curso + ".";
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//Este metodo viene heredado de la clase Persona.
	
	@Override
	public String llamar(String nombre) {
		// TODO Auto-generated method stub
		return super.llamar(nombre);
	}
	
	//Este metodo viene heredado de la clase Persona pero es modificado para esta clase.
	
	@Override
	public String trabajar() {
		// TODO Auto-generated method stub
		return "El alumno " + getNombre() + " va a estudiar para el curso " + getCurso() + ".";
	}
	
	//Se crea el metodo hacerExamen(), el cual obtiene el nombre del objeto que lo llama.
	
	public String hacerExamen() {
		return "El alumno " + getNombre() + " va a hacer el examen.";
	}
	
	
}
