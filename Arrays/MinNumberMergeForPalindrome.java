
public class MinNumberMergeForPalindrome {
    public static int numberOfOperations(int[] arr) {
        if (arr.length <= 1)
            return 0;

        int left = 0, right = arr.length - 1, ans = 0;

        while (left < right) {
            if (arr[left] == arr[right]) {
                left++;
                right--;
            } else if (arr[left] < arr[right]) {
                arr[right] += arr[right - 1];
                right--;
                ans++;
            } else {
                arr[left] += arr[left + 1];
                left++;
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2 };
        System.out.println();
        System.out.println("Result: " + numberOfOperations(arr));
    }
}
