package Problem3;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Triangle("Triangle", 3, 4, 5);
        shapes[1] = new Ellipse("Ellipse", 4, 2);
        shapes[2] = new Circle("Circle", 3);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 4, 4, 4);
        
        System.out.println();
        for (Shape shape:shapes){
            System.out.println(shape);
        }
        System.out.println();
    }
}
