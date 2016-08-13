package tr.org.linux.kamp2016.animals;

public class Owl extends Bird implements Carnivore{

	public Owl(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void rotateHead270Degrees(){
		System.out.println(name + " rotates its head");
	}

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

}
