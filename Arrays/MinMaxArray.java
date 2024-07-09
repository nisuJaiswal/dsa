
class MinMaxArray {
    public static int getMin(int arr[]) {
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min)
                min = arr[i];
        }

        return min;
    }

    public static int getMax(int arr[]) {
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max)
                max = arr[i];
        }

        return max;
    }

    public static void main(String ar[]) {
        int array[] = { 5, 6, 3, 1, 99 };
        System.out.println("\nMax Value: " + getMax(array));
        System.out.println("\nMin Value: " + getMin(array));

    }
}