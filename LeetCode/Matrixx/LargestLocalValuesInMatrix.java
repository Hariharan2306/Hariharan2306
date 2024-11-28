package LeetCode.Matrixx;

public class LargestLocalValuesInMatrix {
    // https://leetcode.com/problems/largest-local-values-in-a-matrix/
    // Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
    // Output: [[9,9],[8,6]]
    // Explanation: The diagram above shows the original matrix and the generated
    // matrix.
    // Notice that each value in the generated matrix corresponds to the largest
    // value of a contiguous 3 x 3 matrix in grid
    public static void main(String[] args) {
        int i = 0, j = 0;
        int[][] grid = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 2, 1, 1 }, { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 } };
        int[][] op = new int[grid.length - 2][grid[0].length - 2];

        for (i = 0; i < grid.length - 2; i++) {
            for (j = 0; j < grid[i].length - 2; j++) {
                op[i][j] = largestLocal(grid, i, j);
            }
        }

        for (i = 0; i < op.length; i++) {
            for (j = 0; j < op.length; j++) {
                System.out.print(op[i][j]);
            }
            System.out.println();
        }

    }

    private static int largestLocal(int[][] grid, int i, int j) {
        int big = 0, k = i, l = j, y = j;
        for (; i <= k + 2 && i < grid.length; i++) {
            for (j = y; j <= l + 2 && j < grid[i].length; j++) {
                // System.out.print(grid[i][j]+" ");
                if (grid[i][j] > big)
                    big = grid[i][j];
            }
            // System.out.println();
        }
        // System.out.println();
        return big;
    }
}
