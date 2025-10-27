package IntPractice;

public class MaxOccurrence {
    // this logic only works if the occurrance is more than n/2
    public static void main(String[] args) {
        int nums[] = { 6, 5, 5 };
        // op 5
        int candidate = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0)
                candidate = nums[i];
            count += candidate == nums[i] ? 1 : -1;
        }
        // find count more than n/2
        count = 0;
        for (int num : nums)
            if (num == candidate)
                count++;
        if (count > nums.length / 2)
            System.out.println(candidate);
    }
}
