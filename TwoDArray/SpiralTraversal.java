import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SpiralTraversal {
    public static List<Integer> printSpiral(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return new ArrayList<>();

        int left = 0, right = matrix[0].length - 1;
        int top = 0, bottom = matrix.length - 1;
        List<Integer> res = new ArrayList<>();

        while (left <= right && top <= bottom) {
            // Left to right (With fixed top)
            for (int i = left; i <= right; i++)
                res.add(matrix[top][i]);
            top += 1;

            // Top to Bottom (With fixed right)
            for (int i = top; i <= bottom; i++)
                res.add(matrix[i][right]);
            right -= 1;

            // Right to Left (With fixed bottom)
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    res.add(matrix[bottom][i]);
                bottom -= 1;
            }

            // Bottom to Top (With fixed Left)
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    res.add(matrix[i][left]);
                left += 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        List<Integer> res = printSpiral(arr);

        Iterator<Integer> it = res.iterator();

        while (it.hasNext())
            System.out.println(it.next() + " ");

    }
}
