package tp1_Java;

import java.util.Scanner;

public class ejercicio_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		
		
		System.out.println("Ingrese un numero del 1 al 10");
		numero = scanner.nextInt();
		
		
		if(numero >= 1 && numero <= 10) {
			System.out.println("Tabla de multiplicar del " + numero + ":");
			for(int i = 0; i<=10; i++) {
				System.out.println(numero + "x" + i + "=" + (numero * i));
			}
		}else {
				System.out.println("Numero no aceptado, fin del programa.");
			}
		
		scanner.close();
	}

}
