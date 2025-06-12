import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Ingrese el primer numero");
		int numero1 = scanner.nextInt();
		
		System.out.println("Ingrese el segundo numero");
		int numero2 = scanner.nextInt();
		
		
		System.out.println("Bienvenido a la calculadora!");
		System.out.println("Presione 1 para suma");
		System.out.println("Presione 2 para resta");
		System.out.println("Presione 3 para multiplicar");
		System.out.println("Presione 4 para dividir");
		
		int operacion = scanner.nextInt();
		
		double resultado = 0;
		boolean operacionValida = true;
		
		switch(operacion) {
		case 1:
			resultado = numero1 + numero2;
			break;
		
		case 2:
			resultado = numero1 - numero2;
			break;
		
		
		
		case 3:
			resultado = numero1 * numero2;
			break;
			
		
		case 4:
				if(numero2 == 0) {
					System.out.println("No se puede dividir por 0");
					operacionValida = false;
				} else {
					resultado = numero1 / numero2;
					
				}
				break;
				
				default:
					System.out.println("Opcion invalida, elija otra opcion");
					operacionValida = false;
		
		
		
		
		}
		
		if(operacionValida) {
			System.out.println("El resultado es " + resultado);
		}
			
		
	}

}
