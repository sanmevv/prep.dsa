import java.util.*;

public class pattern14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = 2 * N;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int idx = N - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(idx + " ");
            }
            System.out.println();
        }
    }
}
