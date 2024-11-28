public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        String s = "leetcode";
        int i, j;
        for (i = 0; i < s.length(); i++) {
            for (j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    break;
                if (j == s.length() - 1) {
                    System.out.println(i);
                    return;
                }
            }
            if (i == s.length() - 1)
                System.out.println(i);
        }
    }
}
