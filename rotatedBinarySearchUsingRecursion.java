import java.util.*;

public class rotatedBinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60 };
        System.out.println(binarySearch(arr, 30, 0, arr.length - 1));
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if (arr[mid] == target)
            return mid;

        if (arr[start] <= arr[mid]) {
            if (target <= arr[mid] && target >= arr[start]) {
                return binarySearch(arr, target, start, mid - 1);
            }
        } else {
            return binarySearch(arr, target, mid + 1, end);
        }
        if (target >= arr[mid] && target <= arr[start]) {
            return binarySearch(arr, target, mid + 1, end);
        }
        return binarySearch(arr, target, start, end - 1);
    }
}
