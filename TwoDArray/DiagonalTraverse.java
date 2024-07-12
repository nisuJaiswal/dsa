
import java.util.*;

public class DiagonalTraverse {

    public static List<Integer> getDiagonal(int N, int[][] A) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int x = 0;
            int y = i;

            while (x < N && y >= 0) {
                res.add(A[x][y]);
                x++;
                y--;
            }

        }

        for (int i = 1; i < N; i++) {
            int x = i;
            int y = N - 1;
            while (x < N && y >= 0) {
                res.add(A[x][y]);
                x++;
                y--;
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println();
        List<Integer> response = getDiagonal(3, arr);

        for (int i : response)
            System.out.print(i + " ");
    }
}