import java.util.*;

public class HeapSorrtt {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(7);
        q.add(8);
        q.add(18);
        q.add(10);
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        System.out.print(insert(q, 5));
        System.out.print(delete(q));

        ArrayList<Integer> list = new ArrayList<>();
        while (!q.isEmpty()) {
            list.add(q.poll());
        }
        System.out.print(list);

    }

    static PriorityQueue<Integer> insert(PriorityQueue<Integer> q, int e) {
        q.add(e);
        return q;

    }

    static PriorityQueue<Integer> delete(PriorityQueue<Integer> q) {
        q.poll();
        return q;
    }
}
