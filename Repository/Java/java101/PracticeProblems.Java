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
        String str = "{";
        int[] reversed = new int[arr.length];
        for (int i >= 0; i = arr.length - 1; i--) {
            if (i > 0){
                str += (arr[i]) + ", ";
        }   else {
            str += (arr[i]);
        }
        }
        return reversed;
    }
 
    static double sumGrid(int[][] arr, int sum) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = 0
            for (int j = 0; j < arr[i].length; j++) {
                sum += grid[i][j];
            }
        }
        return sum;
    }

    static int fib(int n) {
        int a = 0;
        int b = 1;
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
            int newNum = a + b;
            a = b;
            b = newNum;
            }
        } else if (n == 1){
            return int a;
        } else {
            return int b;
        }
        return result;
    }
}

