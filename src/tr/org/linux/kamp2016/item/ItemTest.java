package tr.org.linux.kamp2016.item;

public class ItemTest {
	
	public static void main(String args[]){
		
		System.out.println("Number of items before creating items" + Item.getItemQuantity());
		
		Armor armor = new Armor(100, 50, 200);
		Sword sword = new Sword(50, 20, 40);
		Bow bow = new Bow(20, 5, 2, 5);
		
		System.out.println("Number of items after creating items" + Item.getItemQuantity());
		
		System.out.println(armor);
		System.out.println(sword);
		System.out.println(bow);
		
		armor.useItem();
		armor.getHit(50);
		System.out.println(armor);
		
		armor.upgrade();
		System.out.println("Armor is upgraded");
		System.out.println(armor);
		
		sword.useItem();
		System.out.println(sword);
		
		armor.getHit(100);
		System.out.println(armor);
		System.out.println();
		armor.getHit(300);
		System.out.println(armor);
		
	
	}

}
