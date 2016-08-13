package tr.org.linux.kamp2016.item;

public class Sword extends Weapon {

	public Sword(double price, double weight, double damage) {
		super(price, weight, damage);
	}

	@Override
	public boolean useItem() {
		
		System.out.println("Sword is used and caused damage of " + getDamageAmount() + "points");
		return true;
	}

	public String toString(){
		return "Weapon type: Sword:"
				+super.toString();
		
		
	}
	
}
