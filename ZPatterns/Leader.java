package ZPatterns;

public class Leader {
    public static void main(String[] args) {
        int[] a = { 16, 17, 4, 3, 5, 2 };
        // For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.

        // for (int i = 0; i < a.length; i++) {
        // for (int j = i + 1; j < a.length; j++) {
        // if (a[j] > a[i])
        // break;
        // if (j == a.length - 1)
        // System.out.println(a[i]);
        // }
        // }
        // System.out.println(a[a.length - 1]);
        optimized(a);
    }

    static void optimized(int[] a) {
        int max = a[a.length - 1];
        System.out.println(max);
        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] > max) {
                System.out.println(a[i]);
                max = a[i];
            }
        }
    }
}
