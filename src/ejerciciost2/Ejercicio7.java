package ejerciciost2;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un valor del 0 al 99.999: ");
		num = sc.nextInt();
		
		if(num < 10) {
			System.out.println("Tu valor tiene una cifra.");
		} else if (num < 100) {
			System.out.println("Tu valor tiene dos cifras.");
		} else if (num < 1000) {
			System.out.println("Tu valor tiene tres cifras.");
		} else if (num < 10000) {
			System.out.println("Tu valor tiene cuatro cifras.");
		} else if (num < 100000) {
			System.out.println("Tu valor tiene cinco cifras.");
		} else {
			System.out.println("Tu valor no está entre el 0 y el 99.999.");
		}
		
		sc.close();
	}

}
