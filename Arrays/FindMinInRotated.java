
public class FindMinInRotated {
    public static int findMin(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }

        }
        return arr[left];
    }

    public static void main(String[] args) {
        int nums[] = { 3, 4, 5, 1, 2 };
        System.out.println("\n Minimun value: " + findMin(nums));
    }
}
