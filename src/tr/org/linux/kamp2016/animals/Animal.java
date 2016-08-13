package tr.org.linux.kamp2016.animals;

public abstract class Animal {
	
	String name;
	
	public Animal(){
		name = "hayvan";
	}

	public Animal(String name){
		
		this.name = name;
		
	}
	
	public abstract void breath();
	public abstract void eat();
	public abstract void sleep();
	
}
