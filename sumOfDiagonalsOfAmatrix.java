import java.util.*;

public class sumOfDiagonalsOfAmatrix {
    public static void main(String[] args) {
        int[][] mat = { { 2, 3, 4 }, { 7, 9, 2 }, { 3, 4, 3 } };
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }

        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }
        System.out.println(sum);
    }
}