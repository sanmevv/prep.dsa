import java.util.*;

public class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(multiplication(a, b));
        sum();
        String s = concat();
        System.out.println(s);
        String msg = "sana";
        System.out.println(Arrays.toString(message(msg)));
        String name = "Satyam Saha";
        String personalizedMessage = myGreet(name);
        System.out.println(personalizedMessage);
        System.out.println(swap(20, 30));
        System.out.println(changeName(name));
        int[] Arr = { 1, 3, 6, 9, 12, 17 };
        changeArr(Arr);
        System.out.println(Arrays.toString(Arr));
        varArgs(2, 3, 4, 5, 6, 7, 8, 9);
        multiple(2, 3, 4, 5, 6, 7, 8, 9);
        fun(40);
        fun(30, 40);
        fun("sana");
        fun(30, 40, "sana");
        System.out.println(prime(456733));
        int k = sc.nextInt();
        System.out.println(isArmstrong(k));
        argsNumbers();
    }

    static void argsNumbers() {
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }

    static int multiplication(int a, int b) {
        int product = a * b;
        return product;

    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }

    static String concat() {
        String rev = "how are you?";
        return rev;
    }

    static byte[] message(String a) {
        return a.getBytes();
    }

    static String myGreet(String s) {
        String message = "Hello " + s;
        return message;

    }

    static String swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        String ans = "Now a is " + a + " and b is " + b;
        return ans;
    }

    static String changeName(String name) {
        name = "Ameen Mehvish Sana";
        return name;
    }

    static int[] changeArr(int[] a) {
        a[5] = 15;
        return a;
    }

    static void varArgs(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, int... v) {
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }

    // method overloading
    static void fun(int a) {
        System.out.println(a + " " + "first one");
    }

    static void fun(String s) {
        System.out.println(s + " " + "second one");
    }

    static void fun(int a, int b) {
        System.out.println(a + " " + b + "third one");
    }

    static void fun(int a, int b, String s) {
        System.out.println(a + " " + b + " " + s + "fourth one");
    }

    static boolean prime(int a) {
        if (a <= 1)
            return false;
        if (a % 2 == 0)
            return true;
        else
            return false;
    }

    static boolean isArmstrong(int a) {
        int original = a;
        int sum = 0;
        while (a > 0) {
            int remainder = a % 10;
            a /= 10;
            sum = sum + remainder * remainder * remainder;
        }
        if (sum == original)
            return true;
        else
            return false;
    }
}
