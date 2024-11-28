package LeetCode.Matrixx;

public class MatrixAddition {
    public static void main(String[] args) {
        int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
        int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2 } };
        int[][] c = new int[a.length][a[0].length];
        int i = 0, j = 0;

        for (i = 0; i < a.length && i < b.length; i++) {
            for (j = 0; j < a[i].length && j < b[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
            while (j < a[i].length)
                c[i][j] = a[i][j++];
            while (j < b[i].length)
                c[i][j] = b[i][j++];
        }
        
        for (; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++)
                c[i][j] = a[i][j];
        }
        for (; i < b.length; i++) {
            for (j = 0; j < b[i].length; j++)
                c[i][j] = b[i][j];
        }

        for (i = 0; i < c.length; i++) {
            for (j = 0; j < c[0].length; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
}