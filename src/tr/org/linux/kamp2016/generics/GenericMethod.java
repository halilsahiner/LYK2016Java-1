package tr.org.linux.kamp2016.generics;

public class GenericMethod {
	
	public static < E > void printArray(E[] inputArray){
		
		for(E i : inputArray){
			System.out.println(i);
		}
		
	}

}
