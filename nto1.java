import java.util.*;

public class nto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nto(5);
    }

    static void Nto(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        Nto(n - 1);
    }
}
