package com.itt.librerias;

//Se crea la clase Libro con un atributo de tipo Autor. se crean los contructores y los getters and setters.

public class Libro {
	private String titulo;
	private String genero;
	private Autor escritor;
	

	public Libro(String titulo, String genero, Autor escritor) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.escritor = escritor;
	}



	public Libro() {
		super();
	}



	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Autor getAutor() {
		return escritor;
	}

	public void setAutor(Autor escritor) {
		this.escritor = escritor;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", genero=" + genero + ", autor=" + escritor + "]";
	}
	
	
	
}


