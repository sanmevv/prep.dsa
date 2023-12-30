import java.util.*;

public class binarySearUsingRecursion {
    public static void main(String[] args) {
        int[] arr = { 105, 602, 450, 573, 889, 234, 564, 739 };
        Arrays.sort(arr);
        int target = 450;
        System.out.println(search(0, arr.length - 1, arr, target));
    }

    static int search(int start, int end, int[] arr, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return search(start, mid - 1, arr, target);
        }
        return search(mid + 1, end, arr, target);
    }

}
