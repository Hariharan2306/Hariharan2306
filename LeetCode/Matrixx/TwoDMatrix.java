package LeetCode.Matrixx;

public class TwoDMatrix {
    public static void main(String[] args) {
        int n = 4, i, j, x = 0;
        int[][] a = new int[2 * n - 1][2 * n - 1];

        while (n != 0) {
            for (i = x; i < a.length - x; i++) {
                for (j = x; j < a[i].length - x; j++) {
                    if (i == x || j == x || i == a.length - 1 - x || j == a.length - 1 - x)
                        a[i][j] = n;
                }
            }
            x++;
            n--;
        }

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}

// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334
// 4444444