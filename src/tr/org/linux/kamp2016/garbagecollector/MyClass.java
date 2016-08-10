package tr.org.linux.kamp2016.garbagecollector;

public class MyClass {
	
	int i; 
	
	public MyClass(int i){
		
		this.i = i;
	}
	
	protected void bellektenSil() throws Throwable{
		super.finalize();
	}
	

}
