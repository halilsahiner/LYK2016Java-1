package tr.org.linux.kamp2016.string;

import java.util.Arrays;

public class StringArrayContains {
	public static void main(String args[]){
	
	String[] strMonths = new String[]{"January", "February", "March", "April", "May"};
	
	String strFind1 = "March";
	String strFind2 = "December";
	
	
	boolean contains = false; 
	
	contains = Arrays.asList(strMonths).contains(strFind1);
	System.out.println("Array string'i içeriyor mu?" + strFind1 + contains );
	contains = Arrays.asList(strMonths).contains(strFind2);
	System.out.println("Array string'i içeriyor mu?" + strFind2 + contains );
	
	
	}
	
}
