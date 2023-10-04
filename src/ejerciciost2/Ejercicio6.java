package ejerciciost2;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		double a, b, c, x = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el primer valor de la ecuación: ");
		a = sc.nextInt();
		
		System.out.print("Introduce el segundo valor: ");
		b = sc.nextInt();
		
		System.out.print("Introduce el tercer valor: ");
		c = sc.nextInt();
		
		double discriminant = Math.pow(b, 2) - (4 * a * c);
		
		if(a == 0) {
			x = -c / b;
			System.out.println("La solución de la ecuación es: " + x);
		} else if (discriminant > 0 ) {
			x = discriminant / (2 * a);
			System.out.println("La solución es: " + x);
		} else if(discriminant < 0) {
			System.out.println("La solución no es posible.");
		}
		
		sc.close();
	}

}
