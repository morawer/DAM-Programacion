
public class Profesor extends Persona{
	private String competencias;

	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}
	
	public Profesor() {
		super();
	}
	
	//Este metodo es sobreescrito de la clase Persona y modificado.
	
	@Override
	public String toString() {
		return "Profesor = " + super.toString() + "Competencias: " + competencias + ".";
	}

	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
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
		return "El profesor " + getNombre() + " va a impartir su clase.";
	}
	
	//Se crea el metodo ponerNotas(), el cual obtiene el nombre del objeto que lo llama 
	//y lo introduce en el return.
	
	public String ponerNotas() {
		return "El profesor " + getNombre() + " va a poner las notas.";
	}



	
}
