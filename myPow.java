import java.util.*;

public class myPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(myPow(x, n));
    }

    static double myPow(double x, int n) {
        if (n == 0 || x == 1.0)
            return 1.0;
        if (n == 1)
            return x;
        if (x == -1.0) {
            if (n % 2 == 0)
                return 1.0;
            else
                return -1.0;
        }
        if (n < 0) {
            x = 1.0 / x;
            n = -(n + 1); // Avoids overflow when n = Integer.MIN_VALUE
        }
        if (n % 2 == 0)
            return myPow(x * x, n / 2);
        else
            return x * myPow(x * x, n / 2);
    }
}
