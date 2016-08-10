package tr.org.linux.kamp2016.string;

public class TransposeArray {
	public void Transpose(int[][] array){
		
			
			int k=1;
			for(int i=array.length ; i>=0 ; i--){
				for(int j=array[i].length; j>=0 ; j--){  //array[i].length bir üst döngüdeki değişken olduğuna dikkat et!!
					array[i][j]=k++;
				}
			}
			
			for(int i=0 ; i<array.length ; i++){
				for(int j=0; j<array[i].length ; j++){
					System.out.printf("%4d", array[i][j]);
				}
				System.out.println();
				System.out.println();
			}
			

		
	}

}
