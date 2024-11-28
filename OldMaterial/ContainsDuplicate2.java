package OldMaterial;
public class ContainsDuplicate2 {
//    Given an integer array nums and an integer k, return true if there are two distinct
//    indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//    Example 1:
//    Input: nums = [1,2,3,1], k = 3
//    Output: true
    public static void main(String[] args) {//done
        //time limit failed
        int[] nums={1,2,3,1,2,3};
        int i,j,k=2;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j< nums.length;j++){
                if(nums[i]==nums[j] && k>=Math.abs(i-j)){
//                    System.out.println(nums[i]+" "+nums[j]+" "+i+" "+j);
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }
}
