package LeetCode.Matrixx;

public class DiffInRowCol {
    public static void main(String[] args) {
        int[][] grid = { { 0, 1, 1 }, { 1, 0, 1 }, { 0, 0, 1 } };
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        int[][] op = new int[grid.length][grid[0].length];
        int i, j;

        for (i = 0; i < grid.length; i++) {
            for (j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    row[i]++;
                    col[j]++;
                } else {
                    row[i]--;
                    col[j]--;
                }
            }
        }
        for (i = 0; i < op.length; i++) {
            for (j = 0; j < op.length; j++) {
                op[i][j] = row[i] + col[j];
                System.out.print(op[i][j] + " ");
            }
            System.out.println();
        }
    }

}

// public class DiffInRowCol {
// public static void main(String[] args) {
// int[][] grid = { { 0, 1, 1 }, { 1, 0, 1 }, { 0, 0, 1 } };
// int[][] op = new int[grid.length][grid[0].length];
// int i, j, x, y, one, zero;

// for (i = 0; i < grid.length; i++) {
// for (j = 0; j < grid[i].length; j++) {
// // row
// one = zero = 0;
// for (y = 0; y < grid[i].length; y++) {
// if (grid[i][y] == 0)
// zero++;
// else
// one++;
// }
// for (x = 0; x < grid.length; x++) {
// if (grid[x][j] == 0)
// zero++;
// else
// one++;
// }
// op[i][j] = one - zero;
// }
// }
// for (i = 0; i < grid.length; i++) {
// for (j = 0; j < grid[i].length; j++)
// System.out.print(op[i][j] + " ");
// System.out.println();
// }
// }
// }