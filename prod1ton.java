import java.util.*;

public class prod1ton {
    public static void main(String[] args) {
        System.out.println(facto(8));
    }

    static int facto(int n) {
        if (n <= 1)
            return 1;
        return n * facto(n - 1);
    }

}
