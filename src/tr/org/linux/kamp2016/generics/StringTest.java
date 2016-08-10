package tr.org.linux.kamp2016.generics;

public class StringTest {
	
	public static void main(String args[]){
			
		String s1 = "Ofis çiftçinin kara gün dostudur";
		 char[] charArray = new char[5];
		
		s1.getChars(0, 5, charArray, 2);
		System.out.println("Char arrayi: ");
		for(char character: charArray)
			System.out.print(character);
		
		System.out.println();
		
		
	}

}
