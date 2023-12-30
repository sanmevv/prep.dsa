import java.util.*;

public class MoveAllNegativeNumbersToTheEnd {
    public static void main(String[] args) {
        int[] arr = { -5, 7, -3, -4, 9, 10, -1, 11 };
        int n = arr.length;
        int temp[] = new int[n];

        int j = 0;

        for (int i = 0; i < n; i++)
            if (arr[i] >= 0)
                temp[j++] = arr[i];

        if (j == n || j == 0)
            return;

        for (int i = 0; i < n; i++)
            if (arr[i] < 0)
                temp[j++] = arr[i];

        for (int i = 0; i < n; i++)
            arr[i] = temp[i];

        System.out.println(Arrays.toString(arr));
    }
}
