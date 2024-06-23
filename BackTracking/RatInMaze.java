package BackTracking;

// Intution

// Step 1: Create the 2D array named solution to hold the solution of the array
// Step 2: Make a call on the recursive function which returns the true if the solution is possible, false otherwise
// Step 3: The Recursive function simply accepts the input array, i and j index along with the solution array
// Step 4: As it is the recursive function, make a base case, The base case is to check if the i and j index points to the end of the solution index, if so, then mark the sol[i][j] = 1 and return true;
// Step 5: Now make a function which returns true if the move is safe. This funciton accepts same parameters as recursive function and checks some conditions by which it can say that the ith and jth move is safe or not
// Step 6: If not safe the return false
// Step 7: If safe then make a recursive call on the every possible directino (down, right, up, down), if any of them returns true, then return true
// Step 8: If none of the directions returns true, mark the sol[i][j] as 0 and return false
// 

public class RatInMaze {

    // Checks if the taken step is safe or not
    public static boolean isSafe(int[][] maze, int i, int j, int[][] sol) {
        return (i < maze.length && j < maze.length && i >= 0 && j >= 0 && maze[i][j] == 1 && sol[i][j] == 0);
        // return true;
        // return false;
    }

    // Recursive funciton which checks every possible steps of the rat
    public static boolean recursiveCall(int[][] maze, int i, int j, int[][] sol) {

        // if reaches desination
        if (i == maze.length - 1 && j == maze.length - 1 && maze[i][j] == 1) {
            sol[i][j] = 1;
            return true;
        }

        if (isSafe(maze, i, j, sol)) {
            sol[i][j] = 1;

            // Checking Down step
            if (recursiveCall(maze, i + 1, j, sol))
                return true;

            // Cheking right
            if (recursiveCall(maze, i, j + 1, sol))
                return true;

            // Checking left
            if (recursiveCall(maze, i - 1, j, sol))
                return true;

            // Cheking left
            if (recursiveCall(maze, i, j - 1, sol))
                return true;

            sol[i][j] = 0;
            return false;

        }
        return false;
    }

    // Print Solution Matrix
    public static void printMatrix(int[][] sol) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }

    }

    // Solution Function
    public static void solveMaze(int[][] maze) {
        int len = maze.length;
        int[][] solution = new int[len][len];

        if (recursiveCall(maze, 0, 0, solution))
            printMatrix(solution);
        else
            System.out.println("No Solution Found");

    }

    public static void main(String[] args) {
        System.out.println();
        int[][] maze = {
                { 1, 1, 0, 0 },
                { 1, 1, 1, 1 },
                { 0, 0, 0, 1 },
                { 1, 1, 1, 1 }
        };

        solveMaze(maze);
    }
}
