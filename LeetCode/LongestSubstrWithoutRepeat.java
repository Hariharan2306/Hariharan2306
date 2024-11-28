package LeetCode;


import java.util.HashMap;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubstrWithoutRepeat {
    public static void main(String[] args) {
        String s = "bbbbb";
        // Output: 3
        int i , max = 0;
        for(i=0;i<s.length();i++){
            int combination = subStrCombi(s, i);
            max = max < combination ? combination : max;
        }
        System.out.println(max);
    }
    static int subStrCombi(String s, int start){
        HashMap <Character,Integer> map = new HashMap<>();
        map.put(s.charAt(start), start);
        int i = start - 1, j = start + 1;
        while(i >= 0 || j < s.length() ){
            if(i >= 0 && !map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i);
                i++;
            }
            else if( j < s.length() && !map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), j);
                j++;
            }
            else return map.size();
        }
        return 1;
    }
}
