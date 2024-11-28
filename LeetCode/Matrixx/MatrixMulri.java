package LeetCode.Matrixx;

//incomp
class MatrixMulri {
    public static void main(String[] args) {
        int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        int c[][] = new int[a.length][a[0].length];
        int i, j, k = 0;

        for (k = 0; k < a[0].length; k++) {
            for (i = 0; i < a.length; i++) {
                for (j = 0; j < a[0].length; j++) {
                    c[i][k] += a[i][j] * b[j][i];
                }
            }
        }

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// 1 1 1 1 1 1
// 2 2 2 2 2 2
// 3 3 3 3 3 3