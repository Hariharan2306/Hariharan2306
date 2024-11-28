package LeetCode.Matrixx;

public class TwoDArraySearch {
    public static void main(String[] args) {
        char[][] a = { { 'w', 'e', 'l', 'c', 'o' },
                { 'm', 'e', 't', 'o', 'x' },
                { 'o', 'h', 'o', 'c', 'o' },
                { 'r', 'p', 'o', 'r', 'a' },
                { 't', 'i', 'o', 'n' } };
        String b = "too";
        int i, j, m, x = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                // row
                m = j;
                while (j < a[i].length && b.charAt(x) == a[i][j]) {
                    if (x == b.length() - 1) {
                        System.out.println("(" + i + "," + m + ") && (" + i + "," + j + ")");
                        break;
                    }
                    j++;
                    x++;
                }
                j = m;
                x = 0;
                // col
                m = j;
                while (j < a.length && b.charAt(x) == a[j][i]) {
                    if (x == b.length() - 1) {
                        System.out.println("(" + m + "," + i + ") && (" + j + "," + i + ")");
                        break;
                    }
                    j++;
                    x++;
                }
                j = m;
                x = 0;
            }
        }
    }
}
// (1,2) && (3,2)