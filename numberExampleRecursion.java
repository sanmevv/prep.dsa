import java.util.*;

public class numberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        if (n == 18) {
            System.out.print(18);
            return;
        }
        System.out.print(n + " ");
        print(n + 1);
    }

}
