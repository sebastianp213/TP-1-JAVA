package java_tp1;


import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Ingrese un año");
	int año = scanner.nextInt();

	
	
	if((año % 4 == 0 && año % 100 != 0) || (año % 400  == 0)) {
		System.out.println("El año " + año + " es bisiesto");
	} else {
		System.out.println("El año " + año + " no es bisiesto");
	}
	
	scanner.close();
	
	}

}
