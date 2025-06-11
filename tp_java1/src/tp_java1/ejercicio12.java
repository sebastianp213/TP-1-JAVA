
import java.util.Scanner;

public class ejercicio12
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Ingresa un numero entero");
	    int numero = scanner.nextInt();
	    
	    int suma = 0;
	    int numAbsoluto = Math.abs(numero); // por si ingresan numero negativo
	    
	    while (numAbsoluto > 0){
	        suma += numAbsoluto % 10; //sumar el ultimo digito
	        numAbsoluto /= 10; //elimino el ultimo digito
	        
	    }
	    System.out.println("La suma de los digitos es: " + suma);
	
	}
}