import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero N para la cantidad de filas");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Tiene que ser un numero mayor a 0");
        } else {
            System.out.println("Piramide de " + n + " filas:");

            for (int i = 1; i <= n; i++) {
                // Espacios
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");                 }

                // Asteriscos
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*"); 
                }

                System.out.println();
            }
        }
    }
}