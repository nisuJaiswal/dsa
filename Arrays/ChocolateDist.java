
public class ChocolateDist {

    public static int chocolateDistribute(int[] arr, int m) {
        if (arr.length <= 0 || m == 0 || arr.length - 1 < m)
            return -1;

        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            int window = i + m - 1;
            if (window > arr.length - 1)
                break;

            int diff = arr[window] - arr[i];

            if (diff < minDifference)
                minDifference = diff;
        }
        return minDifference;

    }

    public static void main(String[] args) {
        int arr[] = { 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 };
        int m = 7;

        // Calculate the result using the chocolateDistribution method
        int result = chocolateDistribute(arr, m);

        // Print the result or indicate an invalid input
        if (result != -1) {
            System.out.println("Minimum difference is " + result);
        } else {
            System.out.println("Invalid input");
        }

    }
}
