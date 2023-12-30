public class passingNums {
    public static void main(String[] args) {
        passing(5);
    }

    static void passing(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        passing(--n);
    }
}
