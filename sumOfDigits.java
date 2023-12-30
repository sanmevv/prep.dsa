public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(25));
    }

    static int sumDigits(int n) {
        if (n == 0)
            return 0;

        return (n % 10) + sumDigits(n / 10);
    }
}
