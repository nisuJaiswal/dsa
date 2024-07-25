import java.util.Arrays;

public class SortJumbledNumbers {
    public static int[] sortJumbledNumber(int[] mapping, int[] nums) {
        int res[] = new int[nums.length];

        int[][] map = new int[nums.length][2];

        for (int i = 0; i < nums.length; ++i) {
            int org = nums[i];
            int digit = 1;
            int mappedNumber = nums[i] == 0 ? mapping[0] : 0;

            while (org > 0) {
                int rem = org % 10;
                mappedNumber += digit * nums[rem];
                digit *= 10;
                org /= 10;

            }

            map[i] = new int[] { mappedNumber, i };

        }

        Arrays.sort(map, (a, b) -> {
            return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
        });

        for (int i = 0; i < res.length; i++) {
            res[i] = nums[map[i][1]];
        }
        return res;

    }

    public static void main(String[] ar) {
        int[] mappings = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int[] nums = { 123, 456, 999, 100 };

        int[] res = sortJumbledNumber(mappings, nums);

        System.out.print(Arrays.toString(res));

    }
}
