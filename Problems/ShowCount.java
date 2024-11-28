package Problems;

public class ShowCount {
    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 9, 5, 9, 3, 1 };
        int i, j;
        int[] freq = new int[a.length];

        for (i = 0; i < a.length; i++) {
            freq[i]++;
            for (j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && a[i] != -1) {
                    freq[i]++;
                    a[j] = -1;
                }
            }
        }
        for (i = 0; i < a.length; i++) {
            if (a[i] != -1)
                System.out.println(a[i] + " -- " + freq[i]);
        }
    }
}
