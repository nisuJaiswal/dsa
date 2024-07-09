
public class BitManupilation {
    public static void usingSimpleApproach(int a, int b) {
        int size = Math.abs(b - a) + 1;
        int[] arr = new int[size];

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0 || i % 5 == 0) {
                arr[i - a] = 1;
            }
        }

        System.out.println("\n Here's the result : ");
        for (int el : arr)
            System.out.println(el);
        for (int i = a; i <= b; i++) {
            if (arr[i - a] == 1)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        usingSimpleApproach(2, 10);
    }
}
