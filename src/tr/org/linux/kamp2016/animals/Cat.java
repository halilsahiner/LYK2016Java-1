package tr.org.linux.kamp2016.animals;

public class Cat extends Mammal implements Carnivore {

	String furColor;
	String catPsychology;
	String eyeColor;
	int age;
	
	
	public Cat(String name, String furColor, String catPsychology, String eyeColor, int age) {
		super(name);
		this.furColor = furColor;
		this.catPsychology = catPsychology;
		this.age = age;
		this.eyeColor = eyeColor;
		
		}
	
	public void meow(){
		System.out.println(name + " says meeoowwww");
	}
	
	public void claw(){
		System.out.println(name + " is clawing");
	}

	@Override
	public void hunt() {
		System.out.println(name + " is hunting birds and mice");
	}

	@Override
	public void giveBirth() {
		System.out.println(name + " is giving birth. There will be kittens");
		
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
       System.out.println(name + " is eating Whiskas");		
	}

	@Override
	public void sleep() {
			System.out.println(name + " is sleeping. Purrr!!");
	}

	
	
}
