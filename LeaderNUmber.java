public class LeaderNUmber {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 3, 8, 12, 2, 0, 5, 1 };
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                res = arr[i];
                break;
            }
        }
        System.out.print(res);
    }
}
