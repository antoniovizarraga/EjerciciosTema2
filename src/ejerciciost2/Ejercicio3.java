package ejerciciost2;
import java.util.Scanner;

public class Ejercicio3 {

	/* Crearemos un código que compruebe si un valor dado es un
	 * casi-cero. Es decir, si está cerca de cero. */ 
	public static void main(String[] args) {
		// Creamos la variable que le pediremos al usuario.
		float firstValue = 0f;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Pediremos al usuario el valor a escribir
		System.out.print("Escriba un valor decimal: ");
		firstValue = sc.nextFloat();
		
		/* Comprobamos si el valor es cercano a cero haciendo
		 * varias comprobaciones. Si el número es menor que 1, mayor
		 * que -1 y no es igual a 0, entonces decimos que se trata
		 * de un número casi-cero. En caso contrario, no lo es. */
		if(firstValue < 1 && firstValue > -1 && firstValue != 0) {
			System.out.println("Tu número es un valor casi-cero.");
		} else {
			System.out.println("Tu número no es un valor casi-cero.");
		}
		
		// Cerramos el Scanner.
		sc.close();
	}

}
