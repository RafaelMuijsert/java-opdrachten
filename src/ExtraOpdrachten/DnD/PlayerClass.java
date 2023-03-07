package ExtraOpdrachten.DnD;

public class PlayerClass {

	private static String STRING_FORMAT = "%s (%s%s)";
	private String name;
	private String type;
	private int healthModifier;
	private boolean magic;

	public PlayerClass(String name, String type, int healthModifier, boolean magic) {
		this.name = name;
		this.type = type;
		this.healthModifier = healthModifier;
		this.magic = magic;
	}

	public int getHealthModifier() {
		return this.healthModifier;
	}

	public String toString() {
		return String.format(
				STRING_FORMAT,
				this.name,
				this.type,
				(this.magic ? ", has magic" : "")
		);
	}
}
