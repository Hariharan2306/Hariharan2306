package ZPatterns;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int start = 1, end = nums.length - 2;
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0] = 1;
        suffix[nums.length - 1] = 1;
        while (start < nums.length) {
            prefix[start] = prefix[start - 1] * nums[start - 1];
            suffix[end] = suffix[end + 1] * nums[end + 1];
            start++;
            end--;
        }
        int i = 0;
        while (i < nums.length) {
            nums[i] = prefix[i] * suffix[i];
            i++;
        }
        return nums;
    }
}
