import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3 };

        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set1.add(a[i]);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int j = 0; j < b.length; j++) {
            if (set1.contains(b[j])) {
                set2.add(b[j]);
            }
        }
        int[] result = new int[set2.size()];
        int k = 0;
        for (int n : set2) {
            result[k] = n;
            k++;
        }
        System.out.println(Arrays.toString(result));
        System.out.println(set2.size());
    }
}
