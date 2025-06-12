import java.util.Random;
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Random random = new Random();
		
		String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String minusculas = "abcdefghijklmnopqrstuvwxyz";
		String numeros = "0123456789";
		
		String caracteres = mayusculas + minusculas + numeros;
		
		System.out.println("Ingrese la longitud de la contraseña");
		int longitud = scanner.nextInt();
		
		
		if(longitud <= 0) {
			System.out.println("La longitud tiene que ser mayor a 0");
			return;
	
		
		}
		
		
		String contrasena = "";
		
		for(int i= 0; i<longitud;i++) {
			int indiceAleatorio = random.nextInt(caracteres.length());
			char caracter = caracteres.charAt(indiceAleatorio);
			contrasena = contrasena + caracter;
		}
		
		System.out.println("Tu contraseña guardada es: " + contrasena);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
