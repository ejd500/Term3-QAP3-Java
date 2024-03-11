package Problem3;

class EquilateralTriangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public EquilateralTriangle(String name, double side1, double side2, double side3) {
        super(name);
        if (isValidEquilateralTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.err.println("Sides must all be equal for an equilateral triangle");
            System.exit(1);
        }
    }

    private boolean isValidEquilateralTriangle(double side1, double side2, double side3) {
        return side1 == side2 && side2 == side3 && side3 == side1;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }


}
