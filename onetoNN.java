import java.util.*;

public class onetoNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        onetoN(5);
    }

    static void onetoN(int n) {
        if (n == 0)
            return;
        onetoN(n - 1);
        System.out.print(n + " ");

    }

}
