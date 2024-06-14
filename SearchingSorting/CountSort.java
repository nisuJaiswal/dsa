public class CountSort {

    public static int[] countSort(int[] arr) {
        // Find max element in array
        int max = arr[0];
        for (int i : arr)
            max = Math.max(max, i);

        // System.out.println("Max: " + max);

        // Intialiazine the countArray of Max + 1 length
        int[] countArray = new int[max + 1];

        // insert indices in count array
        for (int i = 0; i < arr.length; i++)
            countArray[arr[i]]++;

        // System.out.println();
        // for (int i : countArray)
        // System.out.println(i + " ");

        // calculate cummulitive frequency
        for (int i = 1; i <= max; i++)
            countArray[i] += countArray[i - 1];

        // for (int i : countArray)
        // System.out.print(i + " ");

        // Make output array and store element accordingly
        int[] outputArray = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            outputArray[countArray[arr[i]] - 1] = arr[i];
            countArray[arr[i]]--;
        }

        return outputArray;

    }

    public static void main(String[] args) {
        int[] inputArray = { 4, 3, 12, 1, 5, 5, 3, 9 };
        int[] outputArray = countSort(inputArray);

        System.out.println();
        for (int i : outputArray)
            System.out.print(i + " ");
    }
}
