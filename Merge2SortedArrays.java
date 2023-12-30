import java.util.*;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 0, 2, 6, 8, 9 };
        bruteForce(arr1, arr2);
        optimized(arr1, arr2);

    }

    static void optimized(int[] arr1, int[] arr2) {
        int left = 0;
        int right = 0;
        while (left < arr1.length && right < arr2.length) {
            if (arr1[left] > arr2[right]) {
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
            }
            left++;
            right++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr1.length; i++) {
            sb.append(arr1[i] + " ");
        }
        for (int i = 0; i < arr2.length; i++) {
            sb.append(arr2[i] + " ");
        }
        System.out.println(sb.toString().trim());
    }

    static void bruteForce(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int left = 0;
        int right = 0;
        int idx = 0;

        // Merge the two arrays into arr3
        while (left < arr1.length && right < arr2.length) {
            if (arr1[left] < arr2[right]) {
                arr3[idx++] = arr1[left++];
            } else {
                arr3[idx++] = arr2[right++];
            }
        }
        while (left < arr1.length) {
            arr3[idx++] = arr1[left++];
        }
        while (right < arr2.length) {
            arr3[idx++] = arr2[right++];
        }

        // Assign values back to arr1 and arr2
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr3[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr3[arr1.length + i];
        }

        // Print the result
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr1.length; i++) {
            sb.append(arr1[i] + " ");
        }
        for (int i = 0; i < arr2.length; i++) {
            sb.append(arr2[i] + " ");
        }

        System.out.println(sb.toString().trim());
    }
}