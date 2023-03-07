package ExtraOpdrachten.DnD;
public class Main {
	public static void main(String[] args) {
		PlayerClass fighter = new PlayerClass("fighter", "martial", 10, false);
		PlayerClass wizard = new PlayerClass("wizard", "caster", 6, true);

		Character vergil = new Character(fighter, "Vergil", 27, 75);
		Character mordekainen = new Character(wizard, "Mordekainen", 55);

		vergil.levelUp();
		mordekainen.levelUp();

		vergil.takeDamage(4);
		mordekainen.takeDamage(3, 8);

		Party party = new Party("The Fellowship of Java");
		party.addCharacter(vergil);
		party.addCharacter(mordekainen);

		System.out.printf("Er zitten %d characters in de party%n", party.getPartySize());

		party.printParty();

		party.attackParty(1, 4);
		party.attackParty("Mordekainen", 4, 8);


		System.out.printf("Er zitten %d characters in de party%n", party.getPartySize());
	}
}