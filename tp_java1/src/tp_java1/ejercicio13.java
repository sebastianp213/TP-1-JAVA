/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.Scanner;

public class ejercicio13
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Conversor de temperaturas");
	System.out.println("1- Pasar Celsius a Fahrenheit");
	System.out.println("2- Lo opuesto al punto 1");
	System.out.println("Elegi una opcion (1 o 2)");
	
	int opcion = scanner.nextInt();
	
	
	double temperatura, resultado;
	
	
	switch(opcion){
	    case 1:
	        System.out.println("Ingresa la temperatura en Celsius: ");
	        temperatura = scanner.nextDouble();
	        resultado = (temperatura * 9 / 5) + 32;
	        System.out.println("Equivale a " + resultado + " Fahrenheit");
	
	    break;
	
	
	case 2:
	    System.out.println("Ingresa la temperatura en Fahrenheit");
	    temperatura = scanner.nextDouble();
	    resultado = (temperatura - 32) * 5/9;
	    System.out.println("Equivale a " + resultado + " Celsius");
	    break;
	
	
	
	default:
	System.out.println("Opcion invalida, elija la opcion 1 o 2");
	}
	}
}