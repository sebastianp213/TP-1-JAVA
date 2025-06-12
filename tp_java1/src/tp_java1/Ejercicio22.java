import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		double prom;
		double suma = 0;
		double[] calificaciones = new double[5];
		System.out.println("Ingrese las calificaciones");
		for(int i=0;i<calificaciones.length;i++) {
			calificaciones[i] = scanner.nextDouble();
			
		}
		
		for(double calificacion : calificaciones) {
			suma += calificacion;
			
		}
		prom = (suma /calificaciones.length);
		
		System.out.println("El promedio de las calificaciones es " + prom);
		
	
		

	}

}
