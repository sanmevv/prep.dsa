import java.util.*;

public class Bajaj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0;

        long M = (long) Math.pow(2, n2);
        while (M > 0) {
            sum += M % 10;
            M /= 10;
        }

        while (sum > 9) {
            int tempSum = 0;
            while (sum > 0) {
                tempSum += sum % 10;
                sum /= 10;
            }
            sum = tempSum;
        }

        System.out.println(sum);
    }
}
