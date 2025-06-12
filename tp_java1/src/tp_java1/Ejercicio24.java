import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		
		//Creo un array de strings con nombres de invitados
		String[] invitados = {"Maria", "Lucas", "Martina", "Diego"};
		
		System.out.println("Lista de invitados");
		
		// recorro el arreglo usando for each
		for(String nombre : invitados) {
			//en cada iteracion, la variable nombre toma el valor de cada arreglo
			System.out.println("- " + nombre);
		}
			
	}

}
