package ejerciciost2;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		double a, b, c, x1, x2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el primer valor de la ecuación: ");
		a = sc.nextInt();
		
		System.out.print("Introduce el segundo valor: ");
		b = sc.nextInt();
		
		System.out.print("Introduce el tercer valor: ");
		c = sc.nextInt();
		
		double discriminant = Math.pow(b, 2) - (4 * a * c);
		
		if(a == 0) {
			x1 = -c / b;
			System.out.println("La ecuación sólo tiene una solución: " + x1);
		} else if (discriminant > 0 ) {
			x1 = (-b + Math.sqrt(discriminant)) / 2 * a;
			x2 = (-b - Math.sqrt(discriminant)) / 2 * a;
			System.out.println("Las soluciones son:\n" + x1 +  "\n" + x2);
		} else if(discriminant < 0) {
			System.out.println("La solución no es posible.");
		}
		
		sc.close();
	}

}
