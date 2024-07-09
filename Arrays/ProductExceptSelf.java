
import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] getProduct(int[] arr) {
        int resultArr[] = new int[arr.length];
        Arrays.fill(resultArr, 1);

        int leftProd = 1;
        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = leftProd;
            leftProd *= arr[i];
        }

        int rightProd = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            resultArr[i] *= rightProd;
            rightProd *= arr[i];
        }

        return resultArr;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4 };
        int[] res = getProduct(numbers);

        System.out.println("\n Results: \n");
        for (int el : res)
            System.out.println(el);
    }
}
