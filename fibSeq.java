import java.util.*;

public class fibSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> sequence = getFibonacciSequence(n);
        for (int num : sequence) {
            System.out.print(num + " ");
        }
    }

    static List<Integer> getFibonacciSequence(int n) {
        List<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sequence.add(fibonacci(i));
        }
        return sequence;
    }

    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }
}
