import java.util.*;

public class HeapSort {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12, 11, 13, 5, 6, 3, 8);
        List<Integer> sorted = heapSort(nums);
        System.out.println("Original List: " + nums);
        System.out.println("Sorted List: " + sorted);
    }

    public static List<Integer> heapSort(List<Integer> list) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(list);
        List<Integer> sortedList = new ArrayList<>();

        while (!minHeap.isEmpty()) {
            sortedList.add(minHeap.poll());
        }
        return sortedList;
    }
}
