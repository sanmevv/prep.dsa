import java.util.*;

public class duplicateNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int[] arr = { 2, 3, 4, 5, 6, 7, 84, 3, 9, 2, 4, 5 };

        for (int num : arr) {
            if (!set.add(num)) {
                list.add(num);
            }
        }
        System.out.println(list);
    }
}
