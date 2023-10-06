package ejerciciost2;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		final int STONE = 1;
		final int PAPER = 2;
		final int SCISSORS = 3;
		int playerRes1, playerRes2;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Piedra, papel o tijeras? Escribe el número correspondiente." +
		"\n" + "1 (Piedra), 2 (Papel), 3 (Tijeras)");
		
		playerRes1 = sc.nextInt();
		
		System.out.print("¿Qué quieres que saque el rival?" + "\n" +
		"1 (Piedra), 2 (Papel), 3 (Tijeras)");
		
		playerRes2 = sc.nextInt();
		
		if(playerRes1 == STONE && playerRes2 == PAPER) {
			System.out.println("Ganó el rival.");
		} else if (playerRes1 == PAPER && playerRes2 == STONE) {
			System.out.println("Ganó el primer jugador.");
		} else if (playerRes1)
		
		sc.close();
	}

}
