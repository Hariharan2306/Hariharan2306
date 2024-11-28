package OldMaterial;
public class StairCase {
    // You are climbing a staircase. It takes n steps to reach the top.
    // Each time you can either climb 1 or 2 steps. In how many distinct ways can
    // you climb to the top?
    // Example 1:
    //
    // Input: n = 2
    // Output: 2
    // Explanation: There are two ways to climb to the top.
    // 1. 1 step + 1 step
    // 2. 2 steps
    public static void main(String[] args) {
        int n = 5, i;
        int first = 1, second = 2, temp = 0;
        if (n <= 2)
            System.out.println(n);
        else {
            for (i = 3; i <= n; i++) {
                temp = second;
                second += first;
                first = temp;
            }
            System.out.println(second);
        }
    }
}
