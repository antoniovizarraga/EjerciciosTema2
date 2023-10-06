package ejerciciost2;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe tu nota: ");
		num = sc.nextInt();
		
		if(num < 5) {
			System.out.println("Has sacado nota INSUFICIENTE.");
		} else if (num < 6 ) {
			System.out.println("Has sacado nota SUFICIENTE.");
		} else if (num < 7) {
			System.out.println("Has sacado nota BIEN.");
		} else if (num < 9) {
			System.out.println("Has sacado nota NOTABLE.");
		} else if (num <= 10) {
			System.out.println("Has sacado nota SOBRESALIENTE.");
		}

		sc.close();
	}

}
