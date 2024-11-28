package LeetCode;

import java.util.ArrayList;
import java.util.List;

// Input: words = ["leet","code"], x = "e"
// Output: [0,1]
// Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.

public class WordsContainingChar {
    public static void main(String[] args) {
        // String[] a = {"leet","code"};
        String[] a = {"abc","bcd","aaaa","cbc"};

        char x = 'a';
        int i;
        List<Integer> list = new ArrayList<>();
        for(i=0;i<a.length;i++)
            if(contains(a[i], x))
                list.add(i);

        System.out.println(list);
    }
    static boolean contains(String s, char c){
        s = "leet";
        int i = 0;
        while(i<s.length()){
            if(s.charAt(i) == c)
                return true;
            i++;
        }
        return false;
    }
}
