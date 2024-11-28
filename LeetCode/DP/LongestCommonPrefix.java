package LeetCode.DP;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        // String[] s = { "flow", "flower", "flight" };
        String[] s = { "ab", "a" };
        // Output: "fl"

        int i, j = 0;
        String op = "";
        char temp;
        // j--elements
        // i--char

        for (i = 0; i < s[0].length(); i++) {
            temp = s[0].charAt(i);
            for (j = 0; j < s.length; j++) {
                if (i >= s[j].length() || temp != s[j].charAt(i)) {
                    System.out.println(op);
                    return;
                }
            }
            op += s[0].charAt(i);
        }

        System.out.println(op);

    }
}