import java.util.*;

public class LinSearch {
    public static void main(String[] args) {
        int[] arr = { 6, 9, 2, 5, 4, 15, 1, 7 };
        int[][] arr2 = { { 0, 1, 2 }, { 2, 3, 4 }, { 5, 8, 9 } };
        int t = 8;
        int n = 0;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println(n + " is found at " + i);
                found = true;
                break;

            }
        }
        if (!found) {
            System.out.println("The element does not exist in the given array");
        }
        SearchString("Sana", 'n');
        System.out.println(MinEl(arr));
        System.out.println(MaxEl(arr));
        System.out.println(Arrays.toString(twoDim(arr2, t)));
        System.out.println(evenElements(arr2));

    }

    static void SearchString(String str, char j) {
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == j) {
                System.out.println("Character " + j + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Character not found in the string");
        }

    }

    static int MinEl(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = Math.min(arr[i], min);
            }
        }
        return min;
    }

    static int MaxEl(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = Math.max(max, arr[i]);
            }
        }
        return max;
    }

    static int[] twoDim(int[][] arr2, int t) {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                if (arr2[i][j] == t) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static ArrayList<Integer> evenElements(int[][] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                if (arr2[i][j] % 2 == 0) {
                    list.add(arr2[i][j]);
                }
            }
        }
        return list;
    }
}
