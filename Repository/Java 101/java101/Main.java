package java101;

public class Main {

    static int countOccurrences(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        return count;
    }

    static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    static double sumGrid(double[][] grid) {
        double sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
            }
        }
        return sum;
    }

    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 2, 2, 5};
        int result = countOccurrences(arr, 2);
        System.out.println("Below are the results for each of the functions above:");
        System.out.println("Number 2 appears " + result + " times in the array.");

        int[] reversedArray = reverseArray(arr);
        System.out.print("Reversed array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        double[][] grid = {
            {1.2, 2.3},
            {3.4, 4.5}
        };
        System.out.println("The sum of all elements in the grid is: " + sumGrid(grid));

        int n = 8;
        System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
    }
    
}


