//Rectangle.java
	
class Rectangle extends Shape{
	//Extends is used for inheriting the properties of class that is variables and methods
	public Rectangle (double length, double width){
		super(length, width, 0, 4);
	}

	public double calculatorArea(){
		return dim_one * dim_two;
	}

	public double calculatePerimeter(){
		return 2 * (dim_one + dim_two);
	}

}