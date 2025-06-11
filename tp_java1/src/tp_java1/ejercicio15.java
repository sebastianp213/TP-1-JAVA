/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.Scanner;

public class ejercicio15
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double saldo = 1000; // saldo inicial
		
		
		int opcion;
		
		
		do{
		    //menu
		    System.out.println("1- Consultar saldo");
		    System.out.println("2- Depositar dinero");
		    System.out.println("3- Retirar dinero");
		    System.out.println("4- salir");
		     System.out.println("Elija una opcion");
		     opcion = scanner.nextInt();
		     
		     switch(opcion){
		         //muestro saldo actual
		         case 1:
		             System.out.println("Su saldo es: " + saldo);
		             
		         break;
		         
		         
		         case 2:
		             //deposito
		             System.out.println("Cuanto quiere depositar?");
		             double deposito = scanner.nextDouble();
		             
		             if(deposito <= 0){
		                 System.out.println("No puede depositar eso");
		             } else{
		                 saldo += deposito;
		                 System.out.println("Deposito exitoso. su saldo es: " + saldo);
		             }
		             break;
		             
		             case 3:
		                 //retiro
		                 System.out.println("Cuanto quiere retirar?");
		                 double retiro = scanner.nextDouble();
		                 
		                 if(retiro <= 0){
		                     System.out.println("El monto debe ser mayor que cero");
		                 } else if(retiro > saldo){
		                     System.out.println("No puede retirar mas de lo que tiene");
		                     
		                 } else{
		                     saldo -=retiro;
		                     System.out.println("Retiro exitoso! su saldo es: " +saldo);
		                 }
		                 break;
		                 
		            
		            case 4:
		                System.out.println("Gracias por usar el cajero, adios");
		                break;
		         
		         default:
		         System.out.println("Opcion invalida, pruebe de nuevo");
		         
		         
		         
		         
		         
		     }
		} while (opcion != 4); //repito hasta que el usuario salga
	}
}