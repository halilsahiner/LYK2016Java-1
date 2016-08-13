package tr.org.linux.kamp2016.animals;

public class AnimalTest {
	
	public static void main(String args[]){
		
		Cat sari = new Cat("Sarı","Sarı","Efendi kedi","Sarı",3 );
		Cat kara = new Cat("Kara","Siyah","İsyankar kedi","Yeşil",3 );
		Cat ucrenk = new Cat("Üçrenk","Sarı, Gri, Beyaz ","Deli kedi","Yeşil",3 );
		Dog fistik = new Dog("Fıstık");
		Owl hedwig = new Owl("Hedwig");
		Snake husnu = new Snake("Hüsnü", "Alengerli Zigzaglı");
		
		fistik.bark();
		fistik.eat();
		sari.meow();
		kara.sleep();
		husnu.clawl();
		
		/*
		Animal an = sari;
		Carnivore car = sari;
		Object o = sari; */
		
		System.out.println("Sarı memeli mi" + isMammal(sari));
		System.out.println("Hedwig memeli mi" + isMammal(hedwig));

	}
	
	static boolean isMammal(Object obj){
		
		if(obj instanceof Mammal){
			
			return true;
		}
		else return false;
	}

}
