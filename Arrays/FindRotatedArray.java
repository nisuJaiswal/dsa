
public class FindRotatedArray {

    public static int findIndex(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println("\nResult: " + findIndex(arr, 0));
    }
}
