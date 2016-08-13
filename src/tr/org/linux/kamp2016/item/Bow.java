package tr.org.linux.kamp2016.item;

public class Bow extends Weapon implements Upgradable {

	private int numArrows;

	public Bow(double price, double weight, double damage, int numArrows) {
		super(price, weight, damage);
		if (numArrows > 0)
			this.numArrows = numArrows;
		else
			this.numArrows = 0;

	}

	@Override
	public void upgrade() {
		numArrows += 10;
	}

	@Override
	public boolean useItem() {
		if (numArrows > 0) {

			System.out.println("The bow threw an arrow caused damage of " + getDamageAmount() + " points");
			numArrows--;
			return true;
		} else
			return false;

	}
	
	public String toString(){
		return "Weapon type: Bow " + 
				"Number of arrows: " + numArrows
				+ super.toString();
	}

}
