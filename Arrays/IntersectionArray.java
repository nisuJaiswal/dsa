package Arrays;

import java.util.*;

public class IntersectionArray {
    public static int[] getIntersecArray(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j])
                j++;
            else if (nums1[i] < nums2[j])
                i++;
            else {
                res.add(nums1[i]);
                i += 1;
                j += 1;
            }
        }

        int[] ans = new int[res.size()];
        for (int x = 0; x < res.size(); x++)
            ans[x] = res.get(x);

        return ans;

    }

    public static void main(String[] args) {
        System.out.println();
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] res = getIntersecArray(nums1, nums2);
        for (int i : res)
            System.out.print(i + " ");
    }
}
