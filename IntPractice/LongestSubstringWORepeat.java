package IntPractice;

public class LongestSubstringWORepeat {
    public static void main(String[] args) {
        String s = "abcabcbb";
        // abc
        int i, j, max = 0, k = 0;
        String currStr = "";

        for (i = 0; i < s.length(); i++) {
            j = i + 1;
            k = i;
            currStr += s.charAt(i);
            while (j < s.length() && !containsChar(currStr, s.charAt(j))) {
                currStr += s.charAt(j);
                j++;
            }
            // System.out.println(currStr + " curr");
            if (currStr.length() > max)
                max = currStr.length();
            currStr = "";
            i = k;
        }
        System.out.println(max);
    }

    static boolean containsChar(String s, char c) {
        for (char el : s.toCharArray()) {
            if (el == c)
                return true;
        }
        return false;
    }
}
