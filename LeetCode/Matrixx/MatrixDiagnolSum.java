package LeetCode.Matrixx;

public class MatrixDiagnolSum {
    // Given a square matrix mat, return the sum of the matrix diagonals.
    // Only include the sum of all the elements on the primary diagonal and all the
    // elements on the secondary
    // diagonal that are not part of the primary diagonal.

    // Input: mat = [[1,2,3],
    // [4,5,6],
    // [7,8,9]]
    // Output: 25
    // Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
    // Notice that element mat[1][1] = 5 is counted only once.

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int i, j, k = 0;

        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                if (j == i || j == mat.length - 1 - i) {
                    k += mat[i][j];
                    // System.out.println(mat[i][j]);
                }
            }
        }
        System.out.println(k);
    }
}
