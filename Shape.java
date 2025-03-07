// Shape.java
abstract class Shape {
    protected double dim_one, dim_two, dim_three;
    int num_sides;
    String shapeName;

    // Constructor with shape name
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
}
