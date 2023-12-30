import java.util.*;

public class sumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(5));
    }

    static int sum(int n) {
        if (n == 1)
            return 1;
        return n + sum(n - 1);
    }

}
