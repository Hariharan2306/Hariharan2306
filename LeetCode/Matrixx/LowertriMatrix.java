package LeetCode.Matrixx;

public class LowertriMatrix {
    public static void main(String[] args) {

        // to print lower triangular matrix alone
        int i, j;
        int a[][] = {
                { 1, 2, 3 },
                { 8, 6, 4 },
                { 4, 5, 6 }
        };
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[0].length; j++) {
                if (j <= i)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}