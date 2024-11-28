public class SortBasedonFreq {
    // sort based on freq of occurrence(freq)
    // if same occurrence check original element sort them(asc)
    public static void main(String[] args) {
        int[] a = { 0, 2, 1, -1, 1, 2, 0, 4, -1, 4 };
        int[] freq = new int[a.length];
        int i, j, t1, t2;

        for (i = 0; i < a.length; i++) {
            freq[i]++;
            for (j = 0; j < a.length; j++) {
                if (a[i] == a[j] && i != j)
                    freq[i]++;
            }
        }
        // sort
        for (i = 0; i < a.length - 1; i++) {
            for (j = 0; j < a.length - 1 - i; j++) {
                if (freq[j] < freq[j + 1]) {
                    t1 = freq[j];
                    t2 = a[j];
                    freq[j] = freq[j + 1];
                    a[j] = a[j + 1];
                    freq[j + 1] = t1;
                    a[j + 1] = t2;
                } else if (freq[j] == freq[j + 1] && a[j] >= a[j + 1]) {
                    t2 = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t2;
                }
            }
        }
        i = 0;
        while (i < a.length) {
            System.out.print(a[i++] + " ");
        }
    }
}
