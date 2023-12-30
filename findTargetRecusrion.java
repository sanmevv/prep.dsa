import java.util.*;

public class findTargetRecusrion {
    public static void main(String[] args) {
        int[] arr = { 9, 18, 54, 36, 45, 54, 63 };
        ArrayList<Integer> ans = findTarget(arr, 54, 0, new ArrayList<>());
        System.out.println(ans);
    }

    static ArrayList<Integer> findTarget(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length)
            return list;
        if (arr[index] == target)
            list.add(index);

        return findTarget(arr, target, index + 1, list);

    }
}
