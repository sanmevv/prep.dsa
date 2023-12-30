import java.util.*;

public class fibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

    static int fib(int n) {
        if (n < 2 && n >= 0)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
