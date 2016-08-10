package tr.org.linux.kamp2016.string;

public class ReverseMultiDimArray {

	/**
	 * @param args
	 */
	public static void main(StringExample[] args) {
		int[][] array = new int[5][8];

		int k = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) { // array[i].length bir
														// üst döngüdeki
														// değişken olduğuna
														// dikkat et!!
				array[i][j] = k++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%4d", array[i][j]);
			}
			System.out.println();
			System.out.println();
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%4d", array[i][j]);
			}
			System.out.println();
			System.out.println();
		}
		
		
		TransposeArray tArray = new TransposeArray();
		tArray.Transpose(array);

		

	}

}
