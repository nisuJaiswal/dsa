
public class TrappingWater {
    public static int findWater(int[] arr) {
        int left = 0, right = arr.length - 1;

        int water = 0;
        int leftMax = 0, rightMax = 0;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (leftMax <= arr[left])
                    leftMax = arr[left];
                else
                    water += leftMax - arr[left];
                left++;
            } else {
                if (rightMax <= arr[right])
                    rightMax = arr[right];
                else
                    water += rightMax - arr[right];
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("\nHers's the result: " + findWater(arr));
    }
}
