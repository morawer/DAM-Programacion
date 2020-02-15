package com.itt.librerias;

//Se crea la classe Autor con sus atributos, con sus constructores y getters and Setters.

public class Autor {
	private String nombre;
	private String biografia;
	
	public Autor(String nombre, String biografia) {
		super();
		this.nombre = nombre;
		this.biografia = biografia;
	}

	public Autor() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", biografia=" + biografia + "]";
	}
	
}
