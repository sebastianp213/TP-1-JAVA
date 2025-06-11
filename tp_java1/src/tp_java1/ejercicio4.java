package tp1_Java

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero positivo N");
		int N = scanner.nextInt();
		
		
		//verifico que sea positivo
		if(N <= 0) {
			System.out.println("Eso no es un numero positivo, ingrese nuevamente");
			scanner.close();
			return;
		}
		
		int sumaPares = 0;
		int sumaImpares = 0;
		
		for(int i = 1; i<= N;i++) {
			if(i % 2 == 0) {
				sumaPares += i;
			} else {
				sumaImpares += i;
			}
		}
		
		System.out.println("Suma de numeros pares desde 1 hasta " + N + ": " + sumaPares);
		System.out.println("Suma de numeros impares desde 1 hasta " + N + ": " + sumaImpares);
		
		scanner.close();
		

	}

}