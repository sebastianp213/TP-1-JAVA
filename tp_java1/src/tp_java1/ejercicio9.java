package java_tp1;

import java.util.Scanner;


public class ejercicio9 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Ingresa el primer numero entero");
	int num1 = scanner.nextInt();
	
	System.out.println("Ingresa el segundo numero entero");
	int num2 = scanner.nextInt();
	
	System.out.println("Ingresa el tercer numero entero");
	int num3 = scanner.nextInt();
	
	int mayor;
	
	
	if(num1 >= num2 && num1 >= num3) {
		mayor = num1;
		
	} else if(num2 >= num1 && num2 >= num3) {
		mayor = num2;
	} else {
		mayor = num3;
	}
	
	System.out.println("El numero mayor es " + mayor);
	
	scanner.close();

	}

}
