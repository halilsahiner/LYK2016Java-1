import java.util.ArrayList;
import java.util.Scanner;

public class Array {
	public static void main(String args[]) {
		//		int a = 1;
		//		int b = 5;
		//		int c = 6;
		//		int total = a+b+c;
		//		int[] erey = new int[3];
		//		erey[0] = a;
		//		erey[1] = b;
		//		erey[2] = c;
		//		int total2 = erey[0] + erey[1] + erey[2];
		//		System.out.println("total:"+total);
		//		System.out.println("total2:"+total2);
		//		
		//		int[] erey2 = new int[] {1,5,6};
		//		int total3= erey2[0] + erey2[1] + erey2[2];
		//		System.out.println("total3:"+total3);
		//		
		//		int total4 = 0;
		//		for(int i = 0; i < erey.length;i++){
		//			total4 = total4 + erey[i];
		//		}
		//		System.out.println("total4:"+total4);

				Scanner input = new Scanner(System.in);
				System.out.println("Bir değer giriniz");
				int inputNumber = input.nextInt();
				ArrayList erreyList5 = new ArrayList();
				int counter = 0;
				while(inputNumber != -1){
					System.out.println("Bir değer giriniz");
				
					if(inputNumber != -1){
					erreyList5.add(inputNumber);
					}
					inputNumber = input.nextInt();
					counter++;			
				}
				
				for(int i = 0; i < erreyList5.size();i++){
					System.out.println("Array Listin" + i + ". elemanı: " 
				+ erreyList5.get(i) );
				}
				
				
				
//		Scanner input = new Scanner(System.in);
//		System.out.println("Bir değer giriniz");
//		String inputString = input.next();
//		String[] errey5 = new String[5];
//		int counter = 0;
//		while(!inputString.equals("çıkış")){
//			System.out.println("Bir değer giriniz");
//			if(!inputString.equals("çıkış")){
//				errey5[counter] = inputString;
//			}
//			inputString = input.next();
//
//			counter++;			
//		}
//
//		for(int i = 0; i < errey5.length;i++){
//			System.out.println("Arrayin" + i + ". elemanı: " 
//					+ errey5[i] );
//		}
	}

}
