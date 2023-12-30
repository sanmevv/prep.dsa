import java.util.*;

public class binSearch {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 8, 9, 2, 10, 19, 34, 6, 7 };
        Arrays.sort(arr);
        int target = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                System.out.println("Target found at " + mid);
                return;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Target not found in the array");
    }

}
