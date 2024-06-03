package Arrays;

public class NextPermuation {

    public static void findNextPermutation(int arr[]) {
        int indexFirst, indexSecond;
        indexFirst = indexSecond = -1;

        // Find the breaking point
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                indexFirst = i;
                break;
            }
        }

        if (indexFirst == -1)
            reverse(arr, 0);
        else {
            // Find element to swap with breaking point

            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] > arr[indexFirst]) {
                    indexSecond = i;
                    break;

                }
            }
            swap(arr, indexFirst, indexSecond);
            reverse(arr, indexFirst + 1);
        }

    }

    public static void reverse(int[] arr, int start) {
        int front = start;
        int back = arr.length - 1;

        while (front < back) {
            swap(arr, front, back);
            front++;
            back--;
        }
    }

    public static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 6, 4 };
        findNextPermutation(arr);
        System.out.println("\nAnswer\n");
        for (int el : arr)
            System.out.println(el);
    }
}
