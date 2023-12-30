public class reverseAnumberr {
    public static void main(String[] args) {
        int reversed = 0;
        int number = 40;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        System.out.println(reversed);
    }
}
