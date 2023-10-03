package ejerciciost2;
import java.util.Scanner;

public class Ejercicio1 {

	/* Vamos a crear un Script que compruebe si un número
	 * introducido por el usuario es par o impar. */
	public static void main(String[] args) {
		/* Creamos la variable que le pediremos al usuario y el resultado
		 * de una operación matemática para saber si el número es par o impar. */
		int firstValue, result = 0;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario el valor.
		System.out.print("Introduzca un valor entero: ");
		firstValue = sc.nextInt();
		
		// Hacemos la operación para guardar el resultado en una variable.
		result = firstValue % 2;
		
		// Comprobamos si es par o impar, y en cada caso responderemos como debe.
		if (result == 0) {
			System.out.println("Tu valor es par.");
		} else {
			System.out.println("Tu valor es impar.");
		}
		
		// Cerramos el Scanner.
		sc.close();
	}

}
