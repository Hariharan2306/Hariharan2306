package IntPractice;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = { "tea", "and", "ace", "ad", "eat", "dans" };
        // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        List<List<String>> list = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals("-1"))
                continue;
            List<String> pair = new ArrayList<>();
            pair.add(strs[i]);
            for (int j = i + 1; j < strs.length; j++) {
                if (!strs[j].equals("-1") && isAnagram(strs[i], strs[j])) {
                    pair.add(strs[j]);
                    strs[j] = "-1";
                }
            }
            list.add(pair);
        }
        System.out.println(list);
    }

    static boolean isAnagram(String str1, String str2) {
        int[] alphabets = new int[26];
        if (str1.length() != str2.length())
            return false;
        for (int i = 0; i < str1.length(); i++) {
            alphabets[str1.charAt(i) - 'a']++;
            alphabets[str2.charAt(i) - 'a']--;
        }
        for (int num : alphabets)
            if (num != 0)
                return false;
        return true;
    }
}
