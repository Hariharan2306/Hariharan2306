package LeetCode.Matrixx;

public class MatrixEquals {
    public static void main(String[] args) {
        int a[][] = {
                { 1, 2, 3 },
                { 8, 4, 6 },
                { 4, 5, 7 }
        };
        int b[][] = {
                { 1, 2, 2 },
                { 8, 4, 6 },
                { 4, 5, 7 }
        };
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                if (a[i][j] != b[i][j]) {
                    System.out.println("Not equal");
                    return;
                }
            }
        }
        System.out.println("equals");
    }
}