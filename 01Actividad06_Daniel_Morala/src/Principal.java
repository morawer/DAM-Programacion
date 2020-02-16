
public class Principal {



	public static void main(String[] args) {
		
		//Se crean los diferentes objetes de cada clase.
		
		Persona p1 = new Alumno ("562147896R", "Daniel Morala", "C/Madrono", "654265985", "1º DAM");
		Persona p2 = new Profesor ("516632211R", "Carlos Robles", "C/Pez Volador, 35", "61666992", "Matematicas y Lengua");
		Persona p3 = new Administrativo("563214789H", "Rosa Torres", "C/ Luna Lunera, 45", "658963214", "Hacer matriculas, controlar asistencia");
		
		//Cada objeto hace la llamada al metodo toString().
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println();
		
		//Cada objeto hace la llamada al metodo trabajar().
		
		System.out.println(p1.trabajar());
		System.out.println(p2.trabajar());
		System.out.println(p3.trabajar());
		
		System.out.println();
		
		//El objeto p1 hace la llamada al metodo llamar() introduciendo como argumento al objeto p2.

		System.out.println(p1.llamar(p2.getNombre()));
		
		System.out.println();
		
		//Cada objeto llama a su metodo propio de su clase haciendo casting.
		
		System.out.println(((Profesor)p2).ponerNotas());
		System.out.println(((Alumno)p1).hacerExamen());
		System.out.println(((Administrativo)p3).gestionarMatricula());
		
	}

}
