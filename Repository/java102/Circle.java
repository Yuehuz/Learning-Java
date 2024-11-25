package java102;

public class Circle implements Shape {
    private double centerX;
    private double centerY;
    private double radius;

    public Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    
    public static Circle fromPoints(Point p1, Point p2, Point p3) {
        double x1 = p1.x;
        double y1 = p1.y;
        double x2 = p2.x;
        double y2 = p2.y;
        double x3 = p3.x;
        double y3 = p3.y;

        double midX1 = (x1 + x2) / 2;
        double midY1 = (y1 + y2) / 2;
        double midX2 = (x2 + x3) / 2;
        double midY2 = (y2 + y3) / 2;

        double slope1 = (y2 - y1) / (x2 - x1);
        double slope2 = (y3 - y2) / (x3 - x2);
        double perpSlope1 = -1 / slope1;
        double perpSlope2 = -1 / slope2;

        double centerX = ((perpSlope1 * midX1 - midY1) - (perpSlope2 * midX2 - midY2)) / (perpSlope1 - perpSlope2);
        double centerY = perpSlope1 * (centerX - midX1) + midY1;

        double radius = Math.sqrt(Math.pow(centerX - x1, 2) + Math.pow(centerY - y1, 2));

        return new Circle(centerX, centerY, radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void printDetails() {
        System.out.println("Center: (" + centerX + ", " + centerY + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}