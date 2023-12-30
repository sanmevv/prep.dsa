import java.util.*;

public class searchInAsortedArrayOfUnknownSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { -1, 0, 3, 6, 9, 12, 16, 20 };
        int target = sc.nextInt();
        System.out.println(findingTarget(arr, target));
        sc.close();
    }

    static int findingTarget(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}