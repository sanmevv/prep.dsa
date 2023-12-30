import java.util.*;

public class quicksortPrac {
    public static void main(String[] args) {
        int[] arr = { 20, 10, 30, 5, 40, 15, 33 };
        int l = 0;
        int h = arr.length;
        quick(arr, l, h);
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
                int t = arr[s];
                arr[s] = arr[e];
                arr[e] = t;
                s++;
                e--;
            }
            quick(arr, l, e);
            quick(arr, s, h);
        }
    }
}
