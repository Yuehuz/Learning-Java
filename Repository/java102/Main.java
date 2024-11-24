package java102;
import java.util.ArrayList;

public class Main {
    public final void main(String[] args) {
        Point[] points = { 
            new Point(1, 2), 
            new Point(3, 4), 
            new Point(10, 6) 
        };
        System.out.println(Point.centerOfMass(points)); 
        Point p = new Point(3, 4); 
        System.out.println(p.angle());
        Point p60 = p.rotate(60);
        System.out.println(p60.x  + p.y);
        Integer[][] intGrid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Grid<Integer> grid = new Grid<>(intGrid);
        ArrayList<Integer> diagonal = grid.diagonal();
        System.out.println(diagonal);
    }
}
   
        


