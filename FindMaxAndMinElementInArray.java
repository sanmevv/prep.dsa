import java.util.*;

public class FindMaxAndMinElementInArray {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 4, 3, 6, 9, 1, 3, 5, };
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = Math.min(arr[i], min);
            }
            if (arr[i] > max) {
                max = Math.max(arr[i], max);
            }
        }
        System.out.println("Maximum Element: " + max + " " + "Minimum Element: " + min);
    }
}
