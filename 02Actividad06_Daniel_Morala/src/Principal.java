import com.itt.librerias.*;

public class Principal {

	public static void main(String[] args) {
		
		//Se crean los objetos y en el objeto creado en la clase libro (lib) se introduce el objeto 
		//de la clase Autor (aut) asi se quedan unidas las dos clases.
		
		Autor aut = new Autor("Cervantes", "Fue un novelista, poeta, dramaturgo y soldado español.");
		Libro lib = new Libro("Don Quijote de la Mancha", "Novela", aut);
	
		System.out.println(lib.toString());
		
		lib.getAutor().setBiografia("Nació en Fuenlabrada el 3 de Octubre de 1984");
		
		System.out.println();
		
		System.out.println(lib.toString());
		System.out.println(aut.toString());
		System.out.println(lib.getAutor().toString());
		
		System.out.println();
		
		lib.setGenero("Novela de aventuras");
		System.out.println(lib.toString());
		
	}
	
}
	