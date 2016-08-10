package tr.org.linux.kamp2016.generics;

public class Box <T> {

	private T t;
	
	/*public Box(T t){
		this.t= t;
	}*/
	
	public void set(T t){
		
		this.t=t;
		
	}
	
	public T get(){
		
		return t;
	}
	
	
}
