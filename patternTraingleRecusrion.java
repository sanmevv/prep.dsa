import java.util.*;

public class patternTraingleRecusrion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pattern(4, 0);
        pattern2(4, 0);
    }

    static void pattern(int r, int c) {
        if (r == 0)
            return;
        if (r > c) {
            System.out.print("* ");
            pattern(r, c + 1);
        } else {
            System.out.println();
            pattern(r - 1, 0);

        }
    }

    static void pattern2(int r, int c) {
        if (r == 0)
            return;
        if (r > c) {
            pattern2(r, c + 1);
            System.out.print("*");
        } else {
            pattern2(r - 1, 0);
            System.out.println();
        }
    }
}