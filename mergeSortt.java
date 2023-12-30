
import java.util.*;

public class mergeSortt {
    public static void main(String[] args) {

        int[] arr1 = { 3, 9, 5, 6, 8, 4 };
        int n = arr1.length;
        int[] arr2 = { 2, 0, 1, 7 };
        int m = arr2.length;
        int[] arr3 = new int[n + m];

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            }
            if (arr1[i] > arr2[j]) {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < n) {
            arr3[k++] = arr1[i++];
        }
        while (j > m) {
            arr3[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
