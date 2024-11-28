package OldMaterial;
public class TwoDArraySearch {
    // Save the string “WELCOMETOZOHOCORPORATION” in a two
    // dimensional array and search for substring like “too” in the two dimensional
    // string both from left to right and from top to bottom
    public static void main(String[] args) {
        char[][] a = { { 'w', 'e', 'l', 'c', 'o' },
                { 'm', 'e', 't', 'o', 'z' },
                { 'o', 'h', 'o', 'c', 'o' },
                { 'r', 'p', 'o', 'r', 'a' },
                { 't', 'i', 'o', 'n' } };
        int i, j, t, k;
        int rowStrt = 0, rowEnd = a.length;
        int colStrt = 0, colEnd = a[0].length;
        String b = "too";
        for (i = rowStrt; i < rowEnd - 1; i++) {// searching right to left
            for (j = colStrt; j < colEnd - 1; j++) {
                if (a[i][j] == b.charAt(0)) {
                    t = j;
                    for (k = 0; k < b.length() && j < colEnd; k++, j++) {
                        if (a[i][j] == b.charAt(k))
                            if (k == b.length() - 1) {
                                System.out.println("(" + i + "," + t + ") && (" + i + "," + j + ")");
                                break;
                            }
                    }
                }
            }
        }
        for (i = colStrt; i < colEnd - 1; i++) {// searching top to bottom
            for (j = rowStrt; j < rowEnd - 1; j++) {
                if (a[j][i] == b.charAt(0)) {
                    t = j;
                    for (k = 0; k < b.length() && j < colEnd; k++, j++) {
                        if (a[j][i] == b.charAt(k))
                            if (k == b.length() - 1) {
                                System.out.println("(" + t + "," + i + ") && (" + j + "," + i + ")");
                                break;
                            }
                    }
                }
            }
        }
    }
}