package java102;
import java.util.ArrayList;

public class Grid<T> {
    private T[][] grid;
    private static int maxSideLength = 0;

    public Grid(T[][] grid) {
        this.grid = grid;
        int sideLength = Math.max(grid.length, getMaxColumns());

        if (sideLength > maxSideLength) {
            maxSideLength = sideLength;
        }
    }

    public ArrayList<T> diagonal() {
        ArrayList<T> diagonalElements = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            if (i < grid[i].length) {
                diagonalElements.add(grid[i][i]);
            }
        }
        return diagonalElements;
    }
    public static int maxSideLength() {
        return maxSideLength;
    }
    private int getMaxColumns() {
        int maxColumns = 0;
        for (T[] row : grid) {
            maxColumns = Math.max(maxColumns, row.length);
        }
        return maxColumns;
    }
}
