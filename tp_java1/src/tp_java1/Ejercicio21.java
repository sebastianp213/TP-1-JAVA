import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int[] numeros = {6,4,78,54,42,13,76,89,1,7};
		
		System.out.println("Ingrese un numero");
		int x = scanner.nextInt();
		
		
		int contador = 0;
		
		for (int numero : numeros) {
			if(numero > x) {
				contador++;
			}
		}
		
		System.out.println("hay " + contador + " numeros mayores a " + x + " en el arreglo");
		
	
	}

}
