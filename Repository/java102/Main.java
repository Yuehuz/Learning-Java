package java102;

public class Main {
    public final void main(String[] args) {
        Point[] points = { 
            new Point(1, 2), 
            new Point(3, 4), 
            new Point(5, 6) 
        };
        System.out.println(Point.centerOfMass(points)); 
        Point p = new Point(3, 4); 
        System.out.println(p.angle());
    }
   
        
}

