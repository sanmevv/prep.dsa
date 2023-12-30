public class countNoOfZeros {
    public static void main(String[] args) {
        System.out.println(count(30204));
    }

    static int count(int n){
        return helper(n,0);
    }

    static int helper(int n, int count) {
        if (n == 0)
            return count;
        if (n % 10 == 0)
            return helper(n / 10, count + 1);

        return helper(n / 10, count);
    }
}
