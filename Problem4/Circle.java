package Problem4;

class Circle extends Shape{
    private double radius;

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        double area = Math.PI*radius*radius;
        return area;
    }

    @Override
    public double getPerimeter(){
        double perimeter = 2*Math.PI*radius;
        return perimeter;
    }

    @Override
    public void scale(double scalingFactor){
        this.radius = this.radius * scalingFactor;
    }

}
