//Cylinder.java
class Cylinder extends Shape implements Volume { 
    public Cylinder(double radius, double height) { 
        super("Cylinder");  
        this.dim_one = radius;  // Radius
        this.dim_two = height;  // Height
    } 

    public double calculateArea() { 
        return 2 * Math.PI * dim_one * (dim_one + dim_two); 
    } 

    public double calculatePerimeter() { 
        return 2 * Math.PI * dim_one; // Base circle perimeter 
    } 

    public double calculateVolume() { 
        return Math.PI * dim_one * dim_one * dim_two; 
    } 
}
