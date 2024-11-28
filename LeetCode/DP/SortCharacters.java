package LeetCode.DP;

public class SortCharacters {
    public static void main(String[] args) {
        String s = "loveleetcode";
        // eert
        int i, j, k = 0;
        int[] a = new int[s.length()];
        int[] idx = new int[s.length()];

        i = 0;
        j = s.length() - 1;
        k = 0;
        while (k < s.length()) {
            if (s.charAt(k) == s.charAt(i))
                a[k]++;
            if (i != j && s.charAt(k) == s.charAt(j))
                a[k]++;
            i++;
            j--;

            if (i > j) {
                i = 0;
                j = s.length() - 1;
                idx[k]=k;
                k++;
            }
        }
        // for (i = 0; i < a.length; i++)
        // System.out.print(a[i] + " ");
        // System.out.println();
        int t, t2;
        for (i = 0; i < a.length - 1; i++) {
            for (j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    t = a[j];
                    t2 = idx[j];
                    a[j] = a[j + 1];
                    idx[j] = idx[j + 1];
                    a[j + 1] = t;
                    idx[j + 1] = t2;
                } else if (a[j] == a[j + 1] && s.charAt(idx[j]) < s.charAt(idx[j + 1])) {
                    t = a[j];
                    t2 = idx[j];
                    a[j] = a[j + 1];
                    idx[j] = idx[j + 1];
                    a[j + 1] = t;
                    idx[j + 1] = t2;
                }
            }
        }
        for (i = 0; i < a.length; i++)
            System.out.print(s.charAt(idx[i]) + " ");
    }
}
