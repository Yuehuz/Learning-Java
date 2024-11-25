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
        Grid<Integer> grid = new Grid<>(new Integer[][]{
            {10, 2, 3},
            {4, 5, 6},
            {7, 8, 8}
        });
        System.out.println(grid.diagonal());
        System.out.println(Grid.maxSideLength());
        Point p1 = new Point(10, 3);
        Point p2 = new Point(3, 10);
        Point p3 = new Point(3, -4);
        Circle circle = Circle.fromPoints(p1, p2, p3);
        circle.printDetails();
        RightTriangle t1 = new RightTriangle(0, 0, 8, 6);
        RightTriangle t2 = new RightTriangle(5, 5, 6, 8);
        t1.printDetails();
        t2.printDetails();
        System.out.println(RightTriangle.similar(t1, t2));
        LibraryItem book1 = new Book("1984", "B001", "George Orwell", 328);
        LibraryItem dvd1 = new DVD("Inception", "D001", 148);
        LibraryItem book2 = new Book("To Kill a Mockingbird", "B002", "Harper Lee", 281);
        LibraryItem dvd2 = new DVD("The Matrix", "D002", 136);
        LibraryItem[] items = {book1, dvd1, book2, dvd2};
        
        System.out.println(book1);
        System.out.println(dvd1);
        book2.checkOut();
        dvd2.checkOut(); 
        book1.checkOut();
        dvd1.checkOut();
        System.out.println("Is the book available? " + book2.available());
        System.out.println("Is the DVD available? " + dvd2.available());
        
       

       ArrayList<LibraryItem> availableItemsList = LibraryItem.availableItems(items);

        System.out.println("Available items:");
        for (LibraryItem item : availableItemsList) {
            System.out.println(item);
        }
    }
}


   
        


