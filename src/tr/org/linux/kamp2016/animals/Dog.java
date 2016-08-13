package tr.org.linux.kamp2016.animals;

public class Dog extends Mammal implements Carnivore {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	public void bark(){
		System.out.println(name + ": Hav! Hav!");
	}
	
	public void sniff(){
		
		System.out.println(name + " is sniffing.");
		
	}
	
	
	@Override
	public void hunt() {
			System.out.println(name + " is trying to hunt cats. Bad dog!");
	}

	@Override
	public void giveBirth() {
		System.out.println(name +" is giving birth. There will be puppies");
	}

	@Override
	public void breath() {
		System.out.println(name +" is breating, we can see its tongue");
	}

	@Override
	public void eat() {
		System.out.println(name + " is eating meat");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	
}
