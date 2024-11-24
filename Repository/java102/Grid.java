package java102;
import java.util.ArrayList;

public class Grid<T> {
    private T[][] grid;   
    public Grid(T[][] grid) {
        this.grid = grid;
    }
    public ArrayList<T> diagonal() {
        ArrayList<T> diagonalElements = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            diagonalElements.add(grid[i][i]);
        }
        return diagonalElements;
    }
}
