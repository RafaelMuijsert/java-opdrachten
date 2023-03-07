package ExtraOpdrachten.DnD;

import java.util.ArrayList;
import java.util.Random;

public class Party {
	private static String STRING_FORMAT = "%s has the following members%s";
	private static String CHARACTER_ADD_NO_HEALTH_FORMAT = "%s heeft %d health en kan niet worden toegevoegd aan de party%n";
	private static String CHARACTER_REMOVED_FROM_PARTY_FORMAT = "%s is uit de party gezet%n";
	private String name;
	private ArrayList<Character> members = new ArrayList<Character>();
	private static int activePlayers;
	private int partySize;

	public Party(String name) {
		this.name = name;
	}

	public int getPartySize() {
		return this.partySize;
	}

	public boolean addCharacter(Character character) {
		if(character.getHealth() <= 0) {
			System.out.printf(
					CHARACTER_ADD_NO_HEALTH_FORMAT,
					character.getName(),
					character.getHealth()
			);
			return false;
		}
		this.members.add(character);
		activePlayers++;
		this.partySize++;
		return true;
	}

	public void removeCharacter(Character character) {
		if(!this.members.contains(character)) {
			return;
		}
		this.members.remove(character);
		activePlayers--;
		this.partySize--;

		System.out.printf(
				CHARACTER_REMOVED_FROM_PARTY_FORMAT,
				character.getName()
		);
	}

	public void printParty() {
		String members = "";
		for(Character member: this.members) {
			members = members.concat("\n\t" + member.toString());
		}
		System.out.printf(
				STRING_FORMAT,
				this.name,
				members
		);
	}

	public void attackParty(String name, int amount, int dice) {
		for(Character member: this.members) {
			if(member.getName().equals(name)) {
				member.takeDamage(amount, dice);
				if(member.getHealth() <= 0) {
					this.removeCharacter(member);
				}
				return;
			}
		}

	}

	public void attackParty(int amount, int dice) {
		int index = new Random().nextInt(0, this.members.size());
		System.out.println(index);
		this.attackParty(this.members.get(index).getName(), amount, dice);
	}
}
