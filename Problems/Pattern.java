package Problems;

public class Pattern {
    public static void main(String[] args) {
        int n = 5, i, j, k;

        for (i = 1; i <= n + 1; i++) {
            k = n + 1;
            for (j = 1; j <= 2 * n + 1; j++) {
                --k;
                if (j <= n + 1 - i)
                    System.out.print(" ");
                else if (j <= n + 1)
                    System.out.print(k);
                else if (j <= n + i)
                    System.out.print(k+=2);
            }
            System.out.println();
        }
    }
}
