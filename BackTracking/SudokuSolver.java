package BackTracking;

public class SudokuSolver {

    public static boolean isSafe(char[][] board, int row, int col, int num) {
        // Check for Row
        // Check for Column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == (char) (num + '0'))
                return false;
            if (board[i][col] == (char) (num + '0'))
                return false;

        }

        // Check for cell of 9
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == (char) (num + '0'))
                    return false;
            }
        }
        return true;
    }

    public static boolean helper(char[][] board, int row, int col) {
        if (row == board.length)
            return true;

        int newRow = 0, newCol = 0;

        if (col == board.length - 1) {
            newCol = 0;
            newRow = row + 1;
        } else {
            newCol = col + 1;
            newRow = row;
        }

        if (board[row][col] != '.') {
            return helper(board, newRow, newCol);

        } else {
            for (int i = 1; i < 10; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, newRow, newCol))
                        return true;
                    else {
                        board[row][col] = '.';
                    }
                }
            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
