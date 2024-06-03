package Arrays;

import java.util.Stack;

public class ReverseArray {
    public static int[] reverseUsingExtraArray(int[] arr) {
        int[] anotherArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            anotherArr[i] = arr[arr.length - i - 1];
        }

        return anotherArr;

    }

    public static int[] revereseUsingStack(int arr[]) {
        int len = arr.length;
        Stack<Integer> stack = new Stack<>();
        for (int el : arr)
            stack.push(el);
        for (int i = 0; i < len; i++) {
            arr[i] = stack.pop();
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        // int[] reversed = reverseUsingExtraArray(arr);
        int[] reversed = revereseUsingStack(arr);

        for (int el : reversed)
            System.out.println(el + " ");
    }
}
