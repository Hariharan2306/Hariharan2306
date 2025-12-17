package ZPatterns;

public class LongestPalinSubStr {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {
        int i = 1;
        String max = "";
        while (i < s.length()) {
            String odd = maxPalin(s, i, i);
            String eve = maxPalin(s, i, i + 1);
            max = max.length() > odd.length() ? max : odd;
            max = max.length() > eve.length() ? max : eve;
            i++;
        }
        return max;
    }

    static String maxPalin(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }

        start++;
        String op = "";
        while (start < end)
            op += s.charAt(start++);
        return op;
    }
}
