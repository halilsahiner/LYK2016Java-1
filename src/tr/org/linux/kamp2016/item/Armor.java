package tr.org.linux.kamp2016.item;

public class Armor extends Item implements Upgradable {

	private double defencePoints;
	private boolean isWorn;
	
	
	public Armor(double price, double weight, double defencePoints) {
		super(price, weight);
	
		if(defencePoints > 0)
			this.defencePoints = defencePoints;
		else
			this.defencePoints = 0;
		
		isWorn = false;
		
	}
	
	

	public double getDefencePoints() {
		return defencePoints;
	}

	public boolean isWorn(){
		return isWorn;
	}
	
	
	public double getHit(double damagePoints){
		if(isWorn){
			if(defencePoints > damagePoints){
				
				defencePoints -= damagePoints;
				return 0;
			}else {
				defencePoints = 0;
				return damagePoints - defencePoints;
			}
			
		}
		
		return damagePoints;
	}



	@Override
	public void upgrade() {
		
		defencePoints += 100;
		
	}

	@Override
	public boolean useItem() {
		isWorn = true;
		return true;
	}



	@Override
	public String toString() {
		return "Armor [defencePoints=" + defencePoints + ", getPrice()=" + getItemPrice() + ", getItemWeight()="
				+ getItemWeight() + "]";
	}
	
	

}
