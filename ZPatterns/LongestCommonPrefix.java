package ZPatterns;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = { "flow", "flower", "flight" };
        // String[] s = { "flow", "flower" };

        int i = 0, max = Math.min(s[0].length(), s[1].length());

        while (i < max && s[0].charAt(i) == s[1].charAt(i) && s[1].charAt(i) == s[2].charAt(i)) {
            i++;
        }
        int k = 0;
        while (k < i) {
            System.out.print(s[0].charAt(k++));
        }
    }
}