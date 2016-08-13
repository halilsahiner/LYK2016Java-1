package tr.org.linux.kamp2016.item;

public abstract class Weapon extends Item {

	private double damageAmount;
	
	
	
	public Weapon(double price, double weight, double damage) {
		super(price, weight);
		if(damage >= 0)
			this.damageAmount = damage;
		else this.damageAmount = 0;
	}
	
	public double getDamageAmount(){
		
		return damageAmount;
	}
	
	public String toString(){
		return "Weapon price: " + getItemPrice() 
		+ " Weapon weight" + getItemWeight()
		+ "Weapon damage amount" + getDamageAmount() + "";
	}
	
	

}
