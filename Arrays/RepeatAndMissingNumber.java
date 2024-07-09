
public class RepeatAndMissingNumber {
    public static int[] findRepeated(final int[] A) {
        int duplicate = -1;
        int missing = -1;

        for (int i = 0; i < A.length; i++) {
            int index = Math.abs(A[i]) - 1;
            if (A[index] < 0) {
                duplicate = Math.abs(A[i]);
            } else {
                A[index] = -A[index];
            }
            // System.out.println("I: " + i + " Duplicate: " + duplicate);
        }
        System.out.println("\nAfter finding duplicates: ");
        for (int el : A)
            System.out.println(el);

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        return new int[] { duplicate, missing };
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 5, 3 };
        int[] result = findRepeated(arr);

        System.out.println("\n Here's the result: ");
        for (int el : result)
            System.out.println(el + " ");
    }
}
