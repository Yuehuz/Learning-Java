package java101;


public class PracticeProblems {
    static int countOccurrences(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
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
     
        static double sumGrid(int[][] grid) {
            int sum = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    sum += grid[i][j];
                }
            }
            return sum;
        }
    
        static int fib(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1){
                return 1;
            }
            int a = 0;
            int b = 1;
            int result = 0;
            for (int i = 2; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
            return result;
        }
    }
    

