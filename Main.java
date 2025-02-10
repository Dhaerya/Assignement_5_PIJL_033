// Main.java

import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of rectangle: ");
		double length = Double.parseDouble(scan.nextLine());

		System.out.println("Enter width of rectangle: ");
		double width = Double.parseDouble(scan.nextLine());

	Shape rectangle = new Rectangle(length, width);
	System.out.println("Area of rectangle is: "+rectangle.calculateArea());
	System.out.println("Perimeter of rectangle is: "+rectangle.calculatePerimeter());
	
	}
}