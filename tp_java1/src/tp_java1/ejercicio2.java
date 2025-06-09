package tp_java1;

public class ejercicio2 {

	public static void main(String[] args) {
		for (int num = 50; num <=100; num++) {
			if(esPrimo(num)) {
				System.out.println(num + ": primo");
			} else {
				System.out.println(num + ":");
			
			for(int i = 1; i<= num; i++) {
				if(num % i == 0) {
					System.out.println(i+ "");
				}
			}
			System.out.println();
			
			}
		}

	}
	
	static boolean esPrimo(int n) {
		if(n < 2) return false;
		for(int i = 2; i <n; i++) {
			if(n % i == 0) return false;
			
		}
		return true;
	}

}
