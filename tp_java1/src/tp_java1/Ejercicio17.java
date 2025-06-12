import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Ingrese su frase");
		String palabra = scanner.nextLine();
		
		//Empiezo desde 1 para que cuente siempre la primera palabra
		int contadorPalabras = 1;
		
		
		//Recorro la frase y cuento las palabras
		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i) == ' ') {
				contadorPalabras++;
			}
			
		}
		
		System.out.println("Su frase tiene: " + contadorPalabras + " palabras");
	}

}
