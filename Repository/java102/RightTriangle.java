package java102;


public class RightTriangle implements Shape {
    private double x; 
    private double y;  
    private double base; 
    private double height;

    public RightTriangle(double x, double y, double base, double height) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height; 
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

    public static boolean similar(RightTriangle t1, RightTriangle t2) {
        // Check similarity by comparing the ratios of the base and height
        double ratioBase = t1.base / t2.base;
        double ratioHeight = t1.height / t2.height;
        return ratioBase == ratioHeight; 
    }

    public void printDetails() {
        System.out.println("Corner: (" + x + ", " + y + ")");
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}


