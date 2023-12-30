import java.util.*;

public class fibonacci {
    static long[] fibCache;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        fibCache = new long[n + 1];
        System.out.println(fib(n));
        System.out.println(fibMemo(n2));
    }

    static int fib(int n) {
        if (n <= 1)
            return n;

        return (fib(n - 1) + fib(n - 2));
    }

    static long fibMemo(int n) {
        if (n <= 1)
            return n;

        if (fibCache[n] != 0) {
            return fibCache[n];
        }
        long nthFibNo = (fib(n - 1) + fib(n - 2));
        fibCache[n] = nthFibNo;

        return nthFibNo;
    }
}
