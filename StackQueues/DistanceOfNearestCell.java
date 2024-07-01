package StackQueues;

import java.util.LinkedList;
import java.util.Queue;

public class DistanceOfNearestCell {
    static class Cell {
        int row, col;

        Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }

        void prinEl() {
            System.out.println("( " + this.row + " " + this.col + " )");
        }
    }

    static int[][] getDistance(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] res = new int[m][n];
        Queue<Cell> queue = new LinkedList<>();

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == 1) {
                    res[i][j] = 0;
                    queue.add(new Cell(i, j));
                } else {
                    res[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        // UP. DOWN, LEFT, RIGHT
        int[] dRow = { -1, 1, 0, 0 };
        int[] dCol = { 0, 0, 1, -1 };
        while (!queue.isEmpty()) {
            Cell c = queue.poll();
            int row = c.row;
            int col = c.col;

            for (int i = 0; i < 4; i++) {

                int newRow = row + dRow[i];
                int newCol = col + dCol[i];
                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n) {

                    if (res[newRow][newCol] > res[row][col] + 1) {
                        res[newRow][newCol] = res[row][col] + 1;
                        queue.add(new Cell(newRow, newCol));
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = { { 0, 1, 1, 0 }, { 1, 1, 0, 0 }, { 0, 0, 1, 1 } };
        int[][] res = getDistance(grid);

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
