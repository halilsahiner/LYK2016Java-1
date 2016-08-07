package triangleexample;

public class RightTriangle {


	/*
	 * File: RightTriangle.java
	 * -------------------
	 * This file defines a simple class for representing right triangles.
	 */


	private double a = 1;
	private double b = 1;

	public RightTriangle(double a, double b) {
		// Your code starts here
		if(0 < a){
			this.a = a;
		}
		if(0 < b){
			this.b = b;
		}
		// Your code ends here
	}


	public double getA() {
		// Your code starts here
		return a;
		// Your code ends here
	}

	public void setA(double a) {
		// Your code starts here
		if(0 < a){
			this.a = a;
		}
		// Your code ends here
	}

	public double getB() {
		// Your code starts here
		return b;
		// Your code ends here
	}

	public void setB(double b) {
		// Your code starts here
		if(0 < b){
			this.b = b;
		}
		// Your code ends here
	}

	public double perimeter() {
		// Your code starts here
		return a + b + hypotenuse();
		// Your code ends here
	}

	private double hypotenuse() {
		// Your code starts here
		return Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		// Your code ends here
	}
	
	public double area() {
		// Your code starts here
		return a * b / 2;
		// Your code ends here
	}

}
