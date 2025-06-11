/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.Scanner;

public class ejercicio14
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Cuantos terminos de la secuncia de Fibonacci quiere ver?");
		int n = scanner.nextInt();
		
		
		if(n <= 0){
		    System.out.println("Tiene que ser un numero mayor a cero");
		} else{
		    System.out.println("Secuencia de Fibonacci con " + n + " terminos:");
		    int a = 0;
		    int b = 1;
		    
		    //hago un bucle para generar y mostrar los primeros n terminos
		    for(int i = 1; i <= n; i++){
		        System.out.print(a + " ");
		        int siguiente = a+b; // calculo el siguiente termino como la suma de los dos anteriores
		       
		       // actualizo los valores para la proxima iteracion
		        a = b;
		        b = siguiente;
		    }
		    
		    
		}
	}
}