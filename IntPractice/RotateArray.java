package IntPractice;

public class RotateArray {
    public static void main(String[] args) {
        String[] a = { "A", "B", "C", "D", "E" };
        int i, n = 5;

        // +3 -> C D E A B
        // -3 -> D E A B C

        n = (n % a.length + a.length) % a.length;

        a = revStrings(a, 0, a.length - 1);
        // here -> E D C B A

        a = revStrings(a, 0, n - 1);
        // here -> C D E B A

        a = revStrings(a, n, a.length - 1);
        // here -> C D E A B

        i = 0;
        while (i < a.length)
            System.out.print(a[i++] + " ");

    }

    static String[] revStrings(String[] a, int start, int end) {
        while (start < end) {
            String temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        return a;
    }

    static void rotateSimple() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3, i, j, temp;

        for (i = 0; i < k; i++) {
            temp = nums[nums.length - 1];
            for (j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[j] = temp;
        }
        for (int num : nums)
            System.out.print(num + " ");
        // [7,1,2,3,4,5,6]
        // Output: [5,6,7,1,2,3,4]
    }
}
// https://leetcode.com/problems/rotate-array/description/