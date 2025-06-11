package java_tp1;

import java.util.Random;
import java.util.Scanner;

public class ejercicio8 {

	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		
		
		int numeroSecreto = random.nextInt(100) + 1; // numero entre 1 y 100
		int intento = 0;
		int contadorIntentos = 0;
		
		System.out.println("Bienvenido al juego 'Adivina el juego'!");
		System.out.println("Elija un numero entre el 1 y 100");
		
		do {
			System.out.println("Vamos, intentalo");
			intento = scanner.nextInt();
			contadorIntentos++;
			
			if(intento < numeroSecreto) {
				System.out.println("El numero es mayor");
			}
			else if(intento > numeroSecreto) {
				System.out.println("El numero es menor");
			} else {
				System.out.println("Correcto! el numero era " + numeroSecreto + ".");
				System.out.println("Lo adivinaste en " + contadorIntentos + "intento(s)");
			}
			
			
		} while(intento != 	numeroSecreto);
		
		scanner.close();
		
	}

}
