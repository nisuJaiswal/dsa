public class FindWinnerOfCircularGame {
    public static int usingRecursion(int n, int k) {
        if (n == 1)
            return 0;
        return (usingRecursion(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        // int res = 0;
        int n = 5, k = 2;
        // System.out.println();

        // for (int i = 1; i <= n; i++) {
        // res = (res + k) % i;
        // }
        // System.out.print(res + 1);

        System.out.print(usingRecursion(n, k) + 1);
    }
}
