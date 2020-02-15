package com.itt.arte;

public class Teatro extends Local implements Sala {
	
	private Obra obra;
	private double precio;
	private Espectador [][] localidades;
	
	
	public Teatro(String domicilio, int metros, int accesos, Obra obra, double precio, Espectador[][] localidades) {
		super(domicilio, metros, accesos);
		this.obra = obra;
		this.precio = precio;
		this.localidades = new Espectador [5][10];
	}


	public Teatro(String domicilio, int metros, int accesos) {
		super(domicilio, metros, accesos);
	}


	public Obra getObra() {
		return obra;
	}


	public void setObra(Obra obra) {
		this.obra = obra;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public Espectador[][] getLocalidades() {
		return localidades;
	}


	public void setLocalidades(Espectador[][] localidades) {
		this.localidades = localidades;
	}


	@Override
	public String verProgramacion() {
		return "Hoy representamos " + obra.getTitulo() + ", género: " 
				+ obra.getGenero() + ", duración: " + obra.getMinutosDuracion() + 
				" minutos. En " + getDomicilio() + " local de " + getMetros() + " metros y con " + getAccesos();
	}


	@Override
	public String verLocalidades() {
		return null;		
	}
			


	@Override
	public String verLocalidadesOcupadas() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String venderLocalidad(int fila, int butaca, Espectador e) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String cancelarLocalidad(int fila, int butaca) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String consultarLocalidad(int fila, int butaca) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public double calcularRecaudacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
