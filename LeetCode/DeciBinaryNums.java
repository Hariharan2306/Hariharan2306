package LeetCode;


public class DeciBinaryNums {
    // https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
    public static void main(String[] args) {
        // String s = "32";
        String s = "27346209830709182346";
        int max = s.charAt(0) - '0';
        // Output: 3
        // Explanation: 10 + 11 + 11 = 32
        for(int i = 0;i<s.length();i++){
            if((s.charAt(i) - '0') > max)
                max = s.charAt(i) - '0';
        }
        System.out.println(max);
    }
}
