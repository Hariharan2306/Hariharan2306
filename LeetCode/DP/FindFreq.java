package LeetCode.DP;

public class FindFreq {
    public static void main(String[] args) {
        String a = "iloveleetcode";
        int[] b = new int[a.length()];
        int i = 0, j = a.length() - 1, k = 0;

        while (k < a.length()) {
            if (a.charAt(k) == a.charAt(i))
                b[k]++;
            if (i != j && a.charAt(k) == a.charAt(j))
                b[k]++;
            i++;
            j--;
            if (i > j) {
                i = 0;
                j = a.length() - 1;
                k++;
            }
        }
        while (i < b.length)
            System.out.print(b[i++] + " ");
    }
}
