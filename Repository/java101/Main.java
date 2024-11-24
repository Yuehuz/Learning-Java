package java101;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println(PracticeProblems.countOccurrences(arr, 2));
        System.out.println(Arrays.toString(PracticeProblems.reverseArray(arr)));
        int [][] grid = {
            {1, 2, 4},
            {2, 3, 5},
            {6, 7, 8}
        };
        System.out.println(PracticeProblems.sumGrid(grid));
        System.out.println(PracticeProblems.fib(2));
	}
}
