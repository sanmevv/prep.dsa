import java.util.*;

public class inversionOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = { 2, 4, 1 };
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            arr.add(sc.nextInt());
        }

        System.out.println("Entered list is: " + arr);

        sc.close();

        int n = arr1.length;
        System.out.println(bruteForceInversion(arr1, n));
    }

    static int bruteForceInversion(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j])
                    count++;
            }
        }
        return count;
    }

    private static long merge(List<Integer> arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        long cnt = 0;

        while (left <= mid && right <= high) {
            if (arr.get(left) <= arr.get(right)) {
                temp.add(arr.get(left));
                left++;
            } else {
                temp.add(arr.get(right));
                cnt += (mid - left + 1);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr.get(left));
            left++;
        }

        while (right <= high) {
            temp.add(arr.get(right));
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr.set(i, temp.get(i - low));
        }

        return cnt;
    }

    public static long mergeSort(List<Integer> arr, int low, int high) {
        long cnt = 0;
        if (low >= high)
            return cnt;
        int mid = (low + high) / 2;
        cnt += mergeSort(arr, low, mid); // left half
        cnt += mergeSort(arr, mid + 1, high); // right half
        cnt += merge(arr, low, mid, high); // merging sorted halves
        return cnt;
    }

    public static long countInversions(List<Integer> arr) {

        return mergeSort(arr, 0, arr.size() - 1);
    }

}
