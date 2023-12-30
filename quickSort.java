import java.util.*;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quick(int[] arr, int l, int h) {
        if (l >= h) {
            return;
        }
        int s = l;
        int e = h;
        int m = s + (e - s) / 2;
        int pivot = arr[m];
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quick(arr, l, e);
        quick(arr, h, s);

    }
}
