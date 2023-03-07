package ExtraOpdrachten.DnD;
import java.util.Random;

public class Character {
	static String STRING_FORMAT = "%s (level: %d %s) - age: %d - hp: %d gold: %d";
	static String LEVEL_UP_FORMAT = "%s is nu level %d en je health is met %d verhoogd naar %d%n";
	static String DAMAGE_FORMAT = "%s krijgt %d schade en %s%n";
	static String HEALTH_STATUS_FORMAT = "heeft nu %d health";
	static String FAINT_FORMAT = "is bewusteloos!";
	static String MAX_HEALTH_FORMAT = "Health van %s mag maximaal %d zijn.%n";
	static int WEALTH_DEFAULT = 100;
	static int DICE_SIDES_DEFAULT = 6;
	static int DICE_ROLLS_DEFAULT = 1;
	private PlayerClass playerClass;
	private String name;
	private int age;
	private int health;
	private int wealth;

	private int level;

	public Character(PlayerClass playerClass, String name, int age, int wealth) {
		this.playerClass = playerClass;
		this.name = name;
		this.age = age;
		this.wealth = wealth;
		this.level = 1;
		this.health = this.getMaxHealth();
	}

	public Character(PlayerClass playerClass, String name, int age) {
		this(playerClass, name, age, WEALTH_DEFAULT);
	}

	public String getName() {
		return this.name;
	}

	public int getMaxHealth() {
		return this.level * this.playerClass.getHealthModifier();
	}

	public boolean setHealth(int health) {
		if (health > getMaxHealth()) {
			System.out.printf(
					MAX_HEALTH_FORMAT,
					this.name,
					this.getMaxHealth()
			);
			return false;
		}
		this.health = health;
		return true;
	}

	public int getHealth() {
		return this.health;
	}


	public void levelUp() {
		this.level++;
		int healthIncrease = new Random().nextInt(
				1,
				this.playerClass.getHealthModifier()
		);
		this.health += healthIncrease;
		System.out.printf(
				LEVEL_UP_FORMAT,
				this.name,
				this.level,
				healthIncrease,
				this.getMaxHealth()
		);

	}

	public void takeDamage(int amount, int dice) {
		int damage = 0;
		for (int i = 0; i < amount; i++) {
			damage += new Random().nextInt(1, dice);
		}
		this.health -= damage;
		String status = (this.health <= 0 ?
				FAINT_FORMAT :
				String.format(HEALTH_STATUS_FORMAT, this.health));

		System.out.printf(
				DAMAGE_FORMAT,
				this.name,
				damage,
				status
		);
	}

	public void takeDamage(int dice) {
		this.takeDamage(DICE_ROLLS_DEFAULT, dice);
	}

	public String toString() {
		return String.format(
				STRING_FORMAT,
				this.name,
				this.level,
				this.playerClass.toString(),
				this.age,
				this.health,
				this.wealth
		);
	}
}
