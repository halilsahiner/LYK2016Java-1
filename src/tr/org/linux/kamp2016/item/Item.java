package tr.org.linux.kamp2016.item;

public abstract class Item {

	private static int itemQuantity=0;
	private double itemPrice;
	private double itemWeight;
	
	
	public Item(double price, double weight){
		
		if(price >= 0)
			itemPrice = price;
		else itemPrice = 0;
		
		if(weight > 0)
			itemWeight = weight;
		else itemWeight = 0;
		
		itemQuantity++;
		
	}
	
	public abstract boolean useItem();
	
	public static int getItemQuantity(){
		
		return itemQuantity;
	}
	
public double getItemPrice(){
		
		return itemPrice;
	}
	
public double getItemWeight(){
	
	return itemWeight;
}
	
	
}
