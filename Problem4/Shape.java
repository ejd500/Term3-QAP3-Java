package Problem4;

abstract class Shape implements Scalable {
    protected String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Abstract method to get area, to be implemented by subclasses
    public abstract double getArea();
    // Abstract method to get perimeter, to be implemented by subclasses
    public abstract double getPerimeter();

    @Override
    public String toString(){
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();

    }

}