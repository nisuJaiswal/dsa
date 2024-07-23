import java.util.*;

public class SortByFrequency {
    public static int[] sortByFreq(int[] nums) {
        int[] freq = new int[201];
        List<Integer> list = new ArrayList<>();

        for (int i : nums) {
            freq[i + 100]++;
            list.add(i);
        }

        Collections.sort(list, (a, b) -> {
            return freq[a + 100] == freq[b + 100] ? b - a : freq[a + 100] - freq[b + 100];

        });

        for (int i = 0; i < nums.length; ++i)
            nums[i] = list.get(i);

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 10, 10, 10, 2, 2, 2, 6, 6, 6, 6, 6, 1 };
        int[] res = sortByFreq(nums);
        System.out.println();
        System.out.println(Arrays.toString(res));
    }
}
