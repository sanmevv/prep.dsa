import java.util.*;

public class MatrixRot90 {
    public static void main(String[] args) {
        int[][] m = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int n = m.length;

        // transpose
        for (int i = 0; i < m.length; i++) {
            for (int j = i; j < m[i].length; j++) {
                if (i != j) {
                    int temp = m[i][j];
                    m[i][j] = m[j][i];
                    m[j][i] = temp;
                }
            }
        }
        // reverse the rows
        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = n - 1;
            while (low < high) {
                int temp2 = m[i][low];
                m[i][low] = m[i][high];
                m[i][high] = temp2;
                low++;
                high--;
            }
        }
        // print the result
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " " + "\t");
            }
            System.out.println();
        }

    }
}
