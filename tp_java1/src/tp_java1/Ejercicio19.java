import java.util.Random;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		Random random = new Random();
		
		int dado1 = random.nextInt(6) + 1; // Le sumo uno porque el random solo llega del 0 al 5
		int dado2 = random.nextInt(6) +1; // lo mismo que el primer dado
		
		
		int suma = dado1 + dado2;
		
		
		System.out.println("Lance los dados");
		System.out.println("Dado 1: " + dado1);
		System.out.println("Dado 2: " + dado2);
		System.out.println("La suma de los 2 dados es: " + suma);
	}

}
