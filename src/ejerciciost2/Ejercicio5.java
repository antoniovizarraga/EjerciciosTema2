package ejerciciost2;
import java.util.Scanner;

public class Ejercicio5 {

	/* Vamos a crear un código que deje escribir dos valores
	 * introducidos por el usuario para después ordenarlos
	 * en pantalla de mayor a menor. */
	public static void main(String[] args) {
		// Creamos los valores a introducir y los inicializamos.
				int firstValue, secondValue = 0;
				
				// Creamos el Scanner.
				Scanner sc = new Scanner(System.in);
				
				// Pedimos los valores.
				System.out.print("Introduzca un valor entero: ");
				firstValue = sc.nextInt();
				
				System.out.print("Introduzca el segundo valor: ");
				secondValue = sc.nextInt();
				
				/* Comprobamos si el primer valor es mayor
				 * que el segundo. En ese caso, ordénalos
				 * según como le especificamos (Dí primero
				 * el primer valor, y luego el segundo. Después
				 * comprueba si son iguales. De ser iguales, dí
				 * que son iguales. Y si nada se cumple, el
				 * muestra el segundo valor y luegp el
				 * primero.  */
				
				if(secondValue < firstValue) {
					System.out.println(firstValue + ", " + secondValue);
				} else if (firstValue == secondValue) {
					System.out.println("Los dos valores introducidos son iguales.");
				} else {
					System.out.println(secondValue + ", " + firstValue);
				}
				
				// Cerramos el Scanner.
				sc.close();

	}

}
