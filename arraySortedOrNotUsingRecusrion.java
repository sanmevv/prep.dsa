public class arraySortedOrNotUsingRecusrion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 14, 5, 6 };
        System.out.println(arraySorted(arr, 0));
    }

    static boolean arraySorted(int[] arr, int index) {

        if (index == arr.length - 1)
            return true;
        return arr[index] < arr[index + 1] && arraySorted(arr, index + 1);
    }
}
