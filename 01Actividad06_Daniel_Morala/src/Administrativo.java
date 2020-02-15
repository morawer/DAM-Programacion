
public class Administrativo extends Persona{
	private String tareas;

	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}

	public Administrativo() {
		super();
	}
	
	//Este metodo es sobreescrito de la clase Persona y modificado.
	
	@Override
	public String toString() {
		return "Administrativo = " + super.toString() + "Tareas: " + tareas + ".";
	}

	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
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
		return "El administrativo " + getNombre() + " va a realizar tareas: " + getTareas() +".";
	}
	
	//Se crea el metodo gestionarMatricula(), el cual obtiene el nombre del objeto que lo llama.
	
	public String gestionarMatricula() {
		return "El administrativo " + getNombre() + " va a gestionar la matricula.";
	}

	
	
}
