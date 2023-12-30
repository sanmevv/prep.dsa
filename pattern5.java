import java.util.*;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int k = 1; k < n; k++) {
            for (int l = 1; l < k; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
