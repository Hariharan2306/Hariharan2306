package LeetCode.DP;

public class ClimbingStairs {
// Example 1:
// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps
    public static void main(String[] args) {
        int n = 4,i,first = 1,second = 2,temp;

        if(n<=2)
            System.out.println(n);
        else{
            for(i=3;i<=n;i++){
                temp = second;
                second+=first;
                first = temp;
            }
            System.out.println(second);
        }
    }
}