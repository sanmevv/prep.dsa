import java.util.*;

public class Hashing2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 180);
        map.put("China", 150);
        map.put("USA", 120);
        System.out.println(map);
        if (map.containsKey("Indonesia")) {
            System.out.println("Contains");
        } else {
            System.out.println("Does Not contain");
        }
        map.put("India", 130);
        System.out.println(map.get("India"));
        System.out.println(map.get("Indonesia"));

        /*
         * int[] arr = { 12, 15, 18, 20 };
         * for (int i = 0; i < arr.length; i++) {
         * if (arr[i] == 15) {
         * System.out.println(i);
         * }
         * }
         * for (int val : arr) {
         * System.out.println(val);
         * }
         */
        System.out.println(" ");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        map.remove("China");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
