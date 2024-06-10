package Arrays;

public class PlusOne {
    public static int[] plusOne(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i] += 1;
                return arr;
            }

            arr[i] = 0;
        }

        arr = new int[arr.length + 1];
        arr[0] = 1;
        return arr;
    }

    public static void main(String[] args) {
        System.out.println();
        int[] arr = { 9 };
        arr = plusOne(arr);

        for (int i : arr)
            System.out.print(i + " ");
    }
}
