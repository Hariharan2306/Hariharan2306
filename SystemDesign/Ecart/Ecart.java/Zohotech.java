import java.util.Scanner;

public class Zohotech {

    // "abc"
    // w=2

    // ab
    // c

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter String ");
        // String s = sc.next();
        // System.out.println("Enter val");
        // int n = sc.nextInt();
        String s = "abcededxzy";
        int n = 4;
        int i, j, k = 0;
        char[][] a = new char[s.length() / n + 1][n];

        for (i = 0; i < s.length() / n + 1; i++) {
            for (j = 0; j < n && k < s.length(); j++) {
                // System.out.print(s.charAt(k++));
                a[i][j] = s.charAt(k++);
            }
            // System.out.println();
        }
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
