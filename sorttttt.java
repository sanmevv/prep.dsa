
import java.util.*;

public class sorttttt {
    public static void main(String[] args) {
        int[] arr = { 2, 14, 5, 18, 3, 10, 9, 7 };
        int[] nums = { 6, 3, 1, 4, 2, 5 };
        System.out.println("Bubble: " + Arrays.toString(bubble(arr)));
        // System.out.println();
        System.out.println("Selection: " + Arrays.toString(selection(arr)));
        // System.out.println();
        // System.out.println();
        System.out.println("Insertion: " + Arrays.toString(insertion(arr)));
        // System.out.println();
        // System.out.println();
        System.out.println("Cyclic: " + Arrays.toString(cyclic(nums)));

    }

    public static int[] bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIdx = 0;

            for (int j = 0; j <= last; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = arr[last];
            arr[last] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
        return arr;
    }

    public static int[] insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    public static int[] cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIdx = arr[i] - 1;
            // Check if the element is within the valid range and not in its correct
            // position
            if (arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[correctIdx]) {
                // Swap the elements
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            } else {
                i++; // Move to the next element if the current one is in its correct position
            }
        }
        return arr;
    }

}
