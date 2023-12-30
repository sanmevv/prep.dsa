import java.util.*;

public class repeatAndMissingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 5 };
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.println("Repeating Number is :" + num);
            }
        }

        int j = 0;
        while (j < arr.length) {
            int currIdx = arr[j] - 1;
            if (arr[j] != arr[currIdx] && arr[j] != j + 1) {
                int temp = arr[j];
                arr[j] = arr[currIdx];
                arr[currIdx] = temp;
            } else {
                j++;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] != k + 1) {
                int mis = k + 1;
                System.out.println("Missing Number is : " + mis);
            }
        }
    }
}