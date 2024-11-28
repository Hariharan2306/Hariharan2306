package LeetCode.Matrixx;

public class IslandPerimeter {
    public static void main(String[] args) {
        int[][] a = { { 1, 1 } };
        int i, j, k = 0, x = 0;

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                if (a[i][j] != 1)
                    continue;
                k = 4;
                if (j - 1 >= 0 && a[i][j - 1] == 1)
                    k--;
                if (j + 1 < a[i].length && a[i][j + 1] == 1)
                    k--;
                if (i - 1 >= 0 && a[i - 1][j] == 1)
                    k--;
                if (i + 1 < a.length && a[i + 1][j] == 1)
                    k--;
                x += k;
            }
        }
        System.out.println(x);
    }
}
