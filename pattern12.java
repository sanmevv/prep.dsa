
import java.util.*;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row < 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            int noOfSpaces = n - c;
            for (int spaces = 0; spaces < noOfSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col);
            }

            for (int col = 2; col <= c; col++) {
                System.out.print(col);
            }

            System.out.println();
        }
    }

}
