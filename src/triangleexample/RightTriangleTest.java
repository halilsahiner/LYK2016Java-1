package triangleexample;

import java.util.Random;

/*
 * Test for RightTriangle Class
 * Creates a number of random right triangles and displays the maximum area and perimeter
 */
public class RightTriangleTest{

	public static void main(String args[]) {

		double maxArea = 0.0;
		double maxPerimeter = 0.0;

		for (int i = 0; i < 10; i++) {
			double a = randomIntegerRandom(1, 50);
			double b = randomIntegerRandom(1, 50);
			

			RightTriangle r = new RightTriangle(a, b);

			if (r.area() > maxArea) {
				maxArea = r.area();
			}
			if (r.perimeter() > maxPerimeter) {
				maxPerimeter = r.perimeter();
			}
		}

		System.out.println("Maximum area = "+ maxArea);
		System.out.println("Maximum perimeter = "+ maxPerimeter);

	}
	
	public static int randomIntegerRandom(int min, int max){
		Random rgen = new Random();
		int range = Math.abs(max - min)+1;
		int random = min+rgen.nextInt(range);
		
		return random;
	}
}
