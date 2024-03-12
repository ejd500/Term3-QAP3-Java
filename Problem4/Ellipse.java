package Problem4;

class Ellipse extends Shape{
    private double majorAxis;
    private double minorAxis;

    public Ellipse(String name, double majorAxis, double minorAxis) {
        super(name);
        this.majorAxis = Math.max(majorAxis, minorAxis);
        this.minorAxis = Math.min(majorAxis, minorAxis);
    }

    @Override
    public double getArea() {
        double area = Math.PI * majorAxis * minorAxis;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = Math.PI * Math.sqrt(2 * (majorAxis * majorAxis + minorAxis * minorAxis) - ((majorAxis - minorAxis) * (majorAxis - minorAxis)) / 2);
        return perimeter;
    }

    @Override
    public void scale(double scalingFactor){
        this.majorAxis = this.majorAxis * scalingFactor;
        this.minorAxis = this.minorAxis * scalingFactor;
    }

}
