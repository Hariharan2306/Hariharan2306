public class SortBasedonFreqString {
    public static void main(String[] args) {
        String s = "tree";
        int i, j, t1;
        char t2;
        char[] c = s.toCharArray();
        int[] freq = new int[c.length];

        for (i = 0; i < s.length(); i++) {
            freq[i]++;
            for (j = 0; j < s.length(); j++) {
                if (c[i] == c[j] && i != j)
                    freq[i]++;
            }
        }
        for (i = 0; i < c.length; i++) {
            for (j = 0; j < c.length - i - 1; j++) {
                if (freq[j] < freq[j + 1]) {
                    t1 = freq[j + 1];
                    t2 = c[j + 1];
                    freq[j + 1] = freq[j];
                    c[j + 1] = c[j];
                    freq[j] = t1;
                    c[j] = t2;
                } else if (freq[j] == freq[j + 1] && c[j] < c[j + 1]) {
                    t2 = c[j + 1];
                    c[j + 1] = c[j];
                    c[j] = t2;
                }
            }
        }
        i = 0;
        while (i < s.length())
            System.out.print(c[i++] + " ");
    }
}
