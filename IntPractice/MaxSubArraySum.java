package IntPractice;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int max = nums[0], curr = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > curr + nums[i])
                curr = nums[i];
            else
                curr += nums[i];
            if (max < curr)
                max = curr;
        }
        System.out.println(max);
    }
}
