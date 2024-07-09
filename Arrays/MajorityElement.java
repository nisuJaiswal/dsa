
public class MajorityElement {
    public static int getMajorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for (int i : nums) {
            if (count == 0) {
                candidate = i;
            }

            if (i == candidate)
                count++;
            else
                count--;
        }

        return candidate;
    }

    public static void main(String[] args) {
        System.out.println();
        int[] arr = { 3, 2, 3, 2, 2, 4, 4, 4, 4, 4, 4, 10 };
        System.out.println(getMajorityElement(arr));
    }
}
