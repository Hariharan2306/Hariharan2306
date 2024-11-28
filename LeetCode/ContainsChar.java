package LeetCode;

public class ContainsChar {
//     Example 1:

// Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
// Output: 2
// Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
    public static void main(String[] args) {
        String s = "abc";
        // String[] words = {"ad","bd","aaab","baa","badab"};
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        for(String x: words){
            if(!contains(x, s)){
                System.out.println(false );
                return;
            }
        }
        System.out.println(true);

    }
    static boolean contains(String word, String s){
        int i,j;
        for(i=0;i<word.length();i++){
            boolean present = false;
            for(j=0;j<s.length();j++){
                if(word.charAt(i) == s.charAt(j))
                    present =  true;
            }
            if(!present) return present;
        }
        return true;
    }
}

// car
// sca
// r