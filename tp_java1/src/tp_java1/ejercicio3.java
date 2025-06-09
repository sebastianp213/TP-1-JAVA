package tp_java1;
import java.util.Scanner;


public class ejercicio3 {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		int num;
		
		
		while(true) {
			System.out.println("Ingrese un numero");
			num = scanner.nextInt();
		
		
		//verifico si el numero es mayor a 100 y si es primo
			if(num > 100 && esPrimo(num)) {
				System.out.println("numero mayor a 100 y primo ingresado. fin del programa");
				break; //salgo del bucle
			} else {
				System.out.println("El numero no cumple con las condiciones, ingrese otro");
			}
			
		}
		scanner.close();
		
		
	}
	
		static boolean esPrimo(int n) {
			if(n < 2) return false;
			for(int i = 2; i <n; i++) {
				if(n % i == 0) return false;
				
			}
			return true;
		}
		
	
}
