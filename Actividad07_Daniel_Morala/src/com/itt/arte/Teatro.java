package com.itt.arte;

import java.util.Scanner;

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
				" minutos. En " + getDomicilio() + ". Local de " + getMetros() + 
				" metros y con " + getAccesos() + " accesos.";
	}


	@Override
	public String verLocalidades() {
		for (int i = 0; i < 5; i++) {
			System.out.println();
			for ( int j = 0; j < 10; j++) {
				if (localidades [i][j] == null) {
					System.out.print(i + "." + j + " Libre. ");
				} else { 
					System.out.print(i + "." + j + " Ocupado. ");
				}
			}	
		}
		return "";
	}		


	@Override
	public String verLocalidadesOcupadas() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String venderLocalidad(int  fila, int butaca, Espectador e) {
	
		String nombre;
		String tlf;
		int edad;
		
		System.out.println("¿En que fila quieres sentarte? (0-4)");
		Scanner sc = new Scanner(System.in);
		fila = sc.nextInt();
		
		System.out.println("¿Y en que butaca? (0-10)");
		butaca = sc.nextInt();
		
		System.out.println("¿Como te llamas?");
		nombre = sc.next();	
		
		System.out.println("¿Cual es tu número de telefono?");
		tlf = sc.next();
		
		System.out.println("¿Cuantos años tienes?");
		edad = sc.nextInt();
		
		sc.close();
		
		localidades[fila][butaca] = new Espectador (nombre, tlf, edad);
		
		return "";
		
		
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