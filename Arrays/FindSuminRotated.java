
public class FindSuminRotated {
    public static boolean getResult(int[] arr, int x) {

        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1])
                break;
        }
        int left = (i + 1) % arr.length;
        int right = (i);

        while (left != right) {
            if (arr[left] + arr[right] == x) {
                return true;
            }

            if (arr[left] + arr[right] < x) {
                left = (left + 1) % arr.length;
            } else {
                right = (arr.length + right - 1) % arr.length;
            }

        }

        return false;

    }

    public static void main(String[] args) {
        int[] nums = { 11, 15, 6, 8, 9, 10 };

        System.out.println("\n Element present status: " + getResult(nums, 23));
    }

}
