package Problem2;

public class Demo {
    public static void main(String[] args) {
        System.out.println();
        Point p1 = new Point(3,4);
        System.out.println("Point 1: " + p1);

        System.out.println();
        MovablePoint mp = new MovablePoint(3, 4);
        System.out.println("Movable Point 1: " + mp);
        System.out.println("Movable Point 1 Moved: " + mp.move());

        System.out.println();
        MovablePoint mp2 = new MovablePoint(2, 3, 4, 5);
        System.out.println("Movable Point 2: " + mp2);
        System.out.println("Movable Point 2 Moved: " + mp2.move());
        System.out.println();
    }
}
