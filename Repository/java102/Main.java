package java102;

public class Main {
    public final void main(String[] args) {
        Point[] points ={
            new Point(1, 1),
            new Point(2, 2),
            new Point(3, 3)

        };
        Point center = Point.centerOfMass(points);
        System.out.println("Center of Mass: (" + center.x + ", " + center.y + ")");
}
}
