import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		boolean existe = false;
		
		String[] paises = {"Argentina", "Chile", "Brasil", "Paraguay", "Uruguay"};
		
		
		System.out.println("Ingrese si el pais esta en el arreglo");
		String ingresoPais = scanner.nextLine();
		
		// Ingreso al arreglo con el for each y me fijo si el pais esta en mi arreglo
		for(String pais : paises) {
			if(ingresoPais.equalsIgnoreCase(pais)) { //pongo equalsIgnoreCase para poder escribir el pais sin la necesidad de poner mayusculas
					existe = true;
			} 
		
		}
		if(existe) {
			System.out.println("El pais " + ingresoPais + " esta en el arreglo");
		} else {
			System.out.println("El pais no esta en el arreglo");
		}
		
		
	}

}
