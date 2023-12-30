import java.util.*;

public class duplicateChars {
    public static void main(String[] args) {
        String[] arr = { "apple", "banana", "promagranate" };
        Set<Character> set = new HashSet<>();
        ArrayList<Character> list = new ArrayList<>();

        for (String word : arr) {
            set.clear();
            for (char c : word.toCharArray()) {
                if (!set.add(c) && !list.contains(c)) {
                    list.add(c);
                }
            }
        }
        System.out.println(list);
    }
}