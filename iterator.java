import java.util.*;

public class iterator {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(8);
        set.add(9);
        set.add(7);
        set.add(4);
        set.add(3);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(8);
        set.add(1);
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + "-> ");
        }
    }
}