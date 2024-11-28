package LeetCode;


class LongestPalinSubstr {
    public static void main(String[] args) {
        longestPalindrome("babad");
    }
    static String longestPalindrome(String s) {
        int i;

        String maxSubStr = "" + s.charAt(0);
        for (i = 0; i < s.length() - 1; i++) {
            String odd = palindromeSubstr(i, i, s);
            String even = palindromeSubstr(i, i + 1, s);
            maxSubStr = maxSubStr.length() < odd.length() ? odd : maxSubStr;
            maxSubStr = maxSubStr.length() < even.length() ? even : maxSubStr;
        }
        return maxSubStr;
    }

    static String palindromeSubstr(int start, int end, String s) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        String substr = "";
        start++;
        while (start < end) {
            substr += s.charAt(start);
            start++;
        }
        return substr;
    }
}