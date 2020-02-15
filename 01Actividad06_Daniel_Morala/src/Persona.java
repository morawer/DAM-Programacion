
//Creo un clase de tipo abstracta.
abstract class Persona {
	private String nif;
	private String nombre;
	private String direccion;
	private String telefono;
	
	public Persona(String nif, String nombre, String direccion, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public Persona() {
		super();
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	//Se crea el metodo toString(). Este metodo sera modificado en cada clase derivada.
	@Override
	public String toString() {
		return "[nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "] ";
	}
	
	//Se crea el metodo llamar(), el objeto llama al metodo e introduce como argumento el objeto destino.
	public String llamar(String nombre) {
		return getNombre() + " llamando a " + nombre;
	}
	//Se crea el metodo trabajar(), es abstracto. Despues cada clase derivada modificar� este metodo.
	public abstract String  trabajar();
}