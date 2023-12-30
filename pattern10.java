import java.util.*;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 0; row < 2 * n; row++) {
            int totalCols = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalCols;
            for (int spaces = 0; spaces < totalCols; spaces++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < noOfSpaces; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
