package IntPractice;

public class AnagramsOutofArr {
    public static void main(String[] args) {
        String[] s = { "cab", "bac", "abc", "tab", "bat" };
        int i, j;

        for (i = 0; i < s.length; i++) {
            boolean flag = true;
            for (j = i + 1; j < s.length; j++) {
                if (s[i] != "-1" && isAnagram(s[i], s[j])) {
                    if (flag) {
                        System.out.print(s[i] + " ");
                        flag = false;
                    }
                    System.out.print(s[j] + " ");
                    s[j] = "-1";
                }
            }
            if (!flag)
                System.out.println();
        }
    }

    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] alphabets = new int[26];
        int i = 0;
        while (i < s.length()) {
            alphabets[s.charAt(i) - 'a']++;
            alphabets[t.charAt(i) - 'a']--;
            i++;
        }
        for (int num : alphabets) {
            if (num != 0)
                return false;
        }
        return true;
    }
}