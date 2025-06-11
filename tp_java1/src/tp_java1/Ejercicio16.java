import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("ingresa los lados");
		
			System.out.println("Ingrese la hipotenusa");
			int hipotenusa = scanner.nextInt();
			
			System.out.println("Ingrese el cateto1");
			int cateto1 = scanner.nextInt();
			
			System.out.println("Ingrese el cateto2");
			int cateto2 = scanner.nextInt();
			
			
			
			
			//me fijo si sus lados son iguales
			if(hipotenusa == cateto1 && hipotenusa == cateto2) {
				System.out.println("Tu triangulo es equilatero");
			}
			//me fijo si el cateto adyacente es igual al cateto obtuso
			else if(cateto1 == cateto2) {
				System.out.println("Tu triangulo es isosceles");
			}
			
			//me fijo si sus lados son diferentes
			else if(hipotenusa != cateto1 && hipotenusa != cateto2) {
				System.out.println("Tu triangulo es escaleno");
			}
		
	}
	
}