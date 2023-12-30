import java.util.*;

public class findAllDuplicatesInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> duplicates = findDuplicates(arr);
        System.out.println(duplicates);
    }

    static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        Set<Integer> duplicatesSet = new HashSet<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                duplicatesSet.add(arr[index]);
            }
        }

        return new ArrayList<>(duplicatesSet);
    }
}
