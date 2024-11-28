package LeetCode;


// https://leetcode.com/problems/longest-palindrome/description/
public class LongestPalin {
    public static void main(String[] args) {
        String s ="abccccdd";
        int op = 0;
        int[] freq = new int[52];
        int i;

        for(i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z')
                freq[ch-'a']++;
            else freq[ch-'A'+26]++;
        }
        i=0;
        boolean midpointFound = false;
        while(i<freq.length){
            if(freq[i]%2==0)
                op+=freq[i];
            else{
                midpointFound = true;
                op+=freq[i]-1;
            }
            i++;
        }
        op = midpointFound ? op+1: op;
        System.out.println(op);
    }
}

// abcc