package Arrays;

public class HIndex {
    public static int giveHIndex(int[] arr) {
        int left = 0;
        int right = Integer.MIN_VALUE;
        for (int i : arr)
            right = Math.max(right, i);

        while (left <= right) {
            int mid = (left + right) / 2;
            if (isPossible(arr, mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left - 1;
    }

    public static boolean isPossible(int[] arr, int mid) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= mid)
                count++;
        }
        return count >= mid;
    }

    public static void main(String[] args) {
        int[] arr = { 13, 6, 6, 10, 5 };
        System.out.println();
        System.out.print("H-Index: " + giveHIndex(arr));
    }
}
