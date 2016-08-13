package tr.org.linux.kamp2016.animals;

public class Snake extends Reptile implements Herbivore, Carnivore {

	String skinType;
	
	public Snake(String name, String skinType) {
		super(name);
		this.skinType = skinType;
	}

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void investigatePlants() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clawl() {
		System.out.println(name +" sürünüyor");		
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		System.out.println("Boa yılanı fil yutmaya çalışıyor");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

}
