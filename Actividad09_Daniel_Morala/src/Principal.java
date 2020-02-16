import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
	
		ArrayList<Bebida> lista = new ArrayList<Bebida>();
		
		double precioTotal = 0;
		int opc = 0;
		
		while (opc != 5) {
			
						System.out.println("******************************");
						System.out.println("******MÁQUINA DE BEBIDAS******");
						System.out.println("******************************");
						System.out.println("1. Coca Cola ------------1.30€");
						System.out.println("2. Fanta Naranja --------1.20€");
						System.out.println("3. Fanta Limón ----------1.20€");
						System.out.println("4. Agua -----------------1.00€");
						System.out.println("5. Apagar máquina.");
						System.out.println("******************************");
						System.out.println();
			
			 			System.out.println("Elija una opción.");
			 			opc = lector.nextInt();
			 			
			 			switch (opc) {
			 			
			 				case 1: lista.add(new Bebida("Coca Cola", 1.30));
			 						System.out.println("Su Coca Cola, gracias.");
			 						break;
			 						
			 				case 2: lista.add(new Bebida("Fanta Naranja", 1.20));
	 								System.out.println("Su Fanta, gracias.");
	 								break;
	 								
			 				case 3: lista.add(new Bebida("Fanta Limón", 1.20));
									System.out.println("Su Fanta, gracias.");
									break;
									
			 				case 4: lista.add(new Bebida("Agua", 1.00));
									System.out.println("Su botella de agua, gracias.");
									break;
									
			 				case 5: System.out.println("HASTA PRONTO");
			 				
			 						for (Bebida ele : lista) {
			 							System.out.println(ele);
			 							precioTotal += ele.getPrecio();
			 						}
			 						System.out.println("PRECIO TOTAL: " + precioTotal + " €");
			 						break;
			 						
			 				default: System.out.println("OPCIÓN INCORRECTA");
			 				
			 			}
			 			
		}
		lector.close();

	}

}
