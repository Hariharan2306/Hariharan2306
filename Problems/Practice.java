package Problems;

public class Practice {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        // Output: [4,5,0,1,2,3]
        int i;
        int[] ans = new int[nums.length];
        for(i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        i=0;
        while(i<nums.length)
            System.out.println(ans[i++]);
    }
}
