
import java.util.Arrays;

public class MegnaticForceBalls {
    public static boolean isPossible(int[] pos, int m, int mid) {
        int prevIndex = 0, count = 1;

        for (int i = 1; i < pos.length; i++) {
            if (pos[i] - pos[prevIndex] >= mid) {
                count++;
                prevIndex = i;
            }
        }
        return count >= m;
    }

    public static int maxDistance(int[] pos, int m) {
        if (m == 2)
            return pos[pos.length - 1] - pos[0];

        Arrays.sort(pos);
        int left = 0, right = pos[pos.length - 1] - pos[0], ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (isPossible(pos, m, mid)) {
                ans = mid;
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println();
        int[] arr = { 1, 2, 3, 4, 7 };
        System.out.println(maxDistance(arr, 3));
    }
}
