package ejerciciost2;
import java.util.Scanner;

public class Ejercicio5 {

	/* Vamos a crear un código que deje escribir dos valores
	 * introducidos por el usuario para después ordenarlos
	 * en pantalla de mayor a menor. */
	public static void main(String[] args) {
		// Creamos los valores a introducir y los inicializamos.
				int num1, num2, num3 = 0;
				
				// Creamos el Scanner.
				Scanner sc = new Scanner(System.in);
				
				// Pedimos los valores.
				System.out.print("Introduzca un valor entero: ");
				num1 = sc.nextInt();
				
				System.out.print("Introduzca el segundo valor: ");
				num2 = sc.nextInt();
				
				System.out.print("Introduzca el tercer valor: ");
				num3 = sc.nextInt();
				
				/* Comprobamos si el primer valor es mayor
				 * que el segundo. En ese caso, ordénalos
				 * según como le especificamos (Dí primero
				 * el primer valor, y luego el segundo. Después
				 * comprueba si son iguales. De ser iguales, dí
				 * que son iguales. Y si nada se cumple,
				 * muestra el segundo valor y luegp el
				 * primero.  */
				
				if (num1 >= num2 && num1 >= num3) {
		            System.out.print(num1 + ", ");
		            if (num2 >= num3) {
		                System.out.println(num2 + ", " + num3);
		            } else {
		                System.out.println(num3 + ", " + num2);
		            }
		        } else if (num2 >= num1 && num2 >= num3) {
		            System.out.print(num2 + ", ");
		            if (num1 >= num3) {
		                System.out.println(num1 + ", " + num3);
		            } else {
		                System.out.println(num3 + ", " + num1);
		            }
		        } else {
		            System.out.print(num3 + ", ");
		            if (num1 >= num2) {
		                System.out.println(num1 + ", " + num2);
		            } else {
		                System.out.println(num2 + ", " + num1);
		            }
		        }
				
				// Cerramos el Scanner.
				sc.close();

	}

}
