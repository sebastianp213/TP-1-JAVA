package java_tp1;


import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
	
		System.out.println("Ingrese una cadena de texto");
		String texto = scanner.nextLine().toLowerCase();
		
		int contadorVocales = 0;
		int contadorConsonantes = 0;
		
		for(int i=0 ; i<texto.length();i++) {
			char c = texto.charAt(i);
		
		if(c >= 'a' && c <= 'z') {  // analizo letras del abecedario
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			contadorVocales++;
		}
		else {
			contadorConsonantes++;
		}
		}
		
		}
		System.out.println("Numero de vocales" + contadorVocales);
		System.out.println("Numero de consonantes" + contadorConsonantes);
		
		scanner.close();
	}

}
