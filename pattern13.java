import java.util.*;

public class pattern13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int idx = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(idx + " ");
            }
            System.out.println();
        }
    }
}
