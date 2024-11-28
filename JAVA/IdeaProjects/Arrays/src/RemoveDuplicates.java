public class RemoveDuplicates{
    //from sorted arrays
    public static void main(String[] args) {
        int []nums={0,0,0,0,3};
        int i=0,n=removeDuplicates(nums);
        while (i<n)
            System.out.print(nums[i++]+" ");
    }
    private static int removeDuplicates(int[] nums) {
        int index = 1;
        int k = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[index] = nums[i+1];
                index++;
                k++;
            }
        }
        return k;
    }
}
//0 0 0 0 3
