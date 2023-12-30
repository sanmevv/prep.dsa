import java.util.*;

public class KthSmallestElementOfArray {
    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 20, 15 };
        int k = 4;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < arr.length - 1; i++) {
            maxHeap.add(arr[i]);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        System.out.println(maxHeap.peek());
    }
}
