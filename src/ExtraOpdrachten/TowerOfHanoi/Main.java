package ExtraOpdrachten.TowerOfHanoi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		TOHFrame frame = new TOHFrame(1020, 600);

		TowerOfHanoi game = new TowerOfHanoi(2);
		while (!game.isWon()) {
			System.out.println(game);
			System.out.println("Choose your tower");
			int tower = scanner.nextInt();
			if(!game.isHoldingPiece()) {
				game.tryTake(tower);
			} else {
				game.tryPlace(tower);
			}
		}
		System.out.println(game);
		System.out.println("U win 👹👹👹👹👹👹👹👅👺");
	}
}
