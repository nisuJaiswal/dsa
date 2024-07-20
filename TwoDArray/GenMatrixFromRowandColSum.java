import java.util.Arrays;

public class GenMatrixFromRowandColSum {
    public static int[][] genMatrix(int[] rowSum, int[] colSum) {
        int rowLen = rowSum.length;
        int colLen = colSum.length;

        int[][] res = new int[rowLen][colLen];

        for (int i = 0; i < rowLen; ++i) {
            for (int j = 0; j < colLen; j++) {
                if (rowSum[i] < colSum[j])
                    res[i][j] = rowSum[i];
                else
                    res[i][j] = colSum[j];

                rowSum[i] -= res[i][j];
                colSum[j] -= res[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] rowSum = { 5, 7, 10 };
        int[] colSum = { 8, 6, 8 };
        int[][] res = genMatrix(rowSum, colSum);

        for (int[] r : res)
            System.out.println(Arrays.toString(r));
    }
}