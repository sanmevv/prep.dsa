import java.util.*;

public class findAllIndeices {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5, 6 };
        int target = 4;

        System.out.println(findAllIndice(arr, target, 0));

    }

    static ArrayList<Integer> findAllIndice(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ans = findAllIndice(arr, target, index + 1);
        list.addAll(ans);
        return list;
    }
}
