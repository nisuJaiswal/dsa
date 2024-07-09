
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int total = nums[j] + nums[k] + nums[i];

                if (total < 0)
                    j++;
                else if (total > 0)
                    k--;
                else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    j++;
                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                }
            }
        }
        return res;

    }

    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        int[] array = { -1, 0, 1, 2, -1, -4 };

        result = threeSum(array);

        System.out.println("\n Result: " + result);
    }
}
