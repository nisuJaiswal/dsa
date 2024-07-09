
public class MaxTrappingWater {
    public static int getMaxWater(int height[]) {
        int left = 0, right = height.length - 1;
        int water = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);

            water = Math.max(water, area);

            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return water;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println("\n Maximum area of water: " + getMaxWater(arr));
    }
}
