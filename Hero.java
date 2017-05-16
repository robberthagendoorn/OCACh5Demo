public class Hero extends Creature {
	{
		setAttack(1);
		setDefense(0);
		setHealth(10);
		setName("Hero");
		setGold(0);
	}

	private Weapon weapon;

	private Armor armor;

	private int numPotions = 0;

	public int getAttack() {
		int base = super.getAttack();
		int added = (weapon != null) ? weapon.getAttack() : 0;
		return base + added;	
	}		
	
	public int getDefense() {
		int base = super.getDefense();
		int added = (armor != null) ? armor.getArmor() : 0;
		return base + added;
	}

	public void setWeapon(Weapon wep) {
		weapon = wep;
	}

	public void setArmor(Armor arm) {
		armor = arm;
	}

	public int getNumPotions() {
		return numPotions;
	}

	public void setNumPotions(int np) {
		numPotions = np;
	}
}

