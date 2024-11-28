package LeetCode.DP;

public class MinCostCimbStairs {
    public static void main(String[] args) {
        int[] a = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
        int first = a[0], second = a[1], i, temp;

        if (a.length <= 2) {
            System.out.println(Math.min(first, second));
            return;
        }
        for (i = 2; i < a.length; i++) {
            temp = a[i] + Math.min(first, second);
            // System.out.println(temp);
            first = second;
            second = temp;
        }
        System.out.println(Math.min(first, second));
    }
}
// i=9