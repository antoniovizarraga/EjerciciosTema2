package ejerciciost2;
import java.util.Scanner;

public class Ejercicio2 {
	
	/* Crearemos un código que compruebe si dos valores introducidos
	 * son iguales o no. Para luego decirle al usuario el resultado. */
	public static void main(String[] args) {
		// Creamos los dos valores que le pediremos al usuario.
		int firstValue, secondValue = 0;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos los valores al usuario.
		System.out.print("Introduce un valor entero: ");
		firstValue = sc.nextInt();
		
		System.out.print("Introduce el segundo valor entero: ");
		secondValue = sc.nextInt();
		
		
		/* Comprobamos si los dos valores son iguales. En caso de serlo,
		 * hazle saber al usuario que son iguales, y viceversa. */
		if(firstValue == secondValue) {
			System.out.println("Los dos valores introducidos son iguales.");
		} else {
			System.out.println("Los dos valores introducidos no son iguales.");
		}
		
		// Cerramos el Scanner.
		sc.close();
	}

}
