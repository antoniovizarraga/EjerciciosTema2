package ejerciciost2;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int firstValue, result = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un valor entero: ");
		firstValue = sc.nextInt();
		
		result = firstValue % 2;
		
		if (result == 0) {
			System.out.println("Tu valor es par.");
		} else {
			System.out.println("Tu valor es impar.");
		}
		
		sc.close();
	}

}
