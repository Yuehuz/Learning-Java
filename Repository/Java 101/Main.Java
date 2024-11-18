package java101;

public class PracticeQuestions {
    static int countOccurrences(int[] arr, int n ）{
        int count =0;
        for (int i =0, i <= arr.length - 1; i++) {
            if (arr[i] == n) {
                count ++;
            }
        }
        return count;
    }
}