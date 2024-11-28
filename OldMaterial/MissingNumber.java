package OldMaterial;
public class MissingNumber {
//    Given an array nums containing n distinct numbers in the range [0, n], return the only
//    number in the range that is missing from the array.
//    Example 1:
//
//    Input: nums = [3,0,1]
//    Output: 2
//    Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
//    2 is the missing number in the range since it does not appear in nums.

    public static void main(String[] args) {
        int[] nums={0,1};
        int i,big=0,small=0;
        for(i=0;i< nums.length;i++){
            if(nums[big]<nums[i])
                big=i;
            if(nums[small]>nums[i])
                small=i;
        }
        small=nums[small];
        big=nums[big];

        boolean present=false;
        while (small<=big){/*3,0,1*/
            for(i=0;i< nums.length;i++) {
                if (small==nums[i]){
                    small++;
                    present=true;
                    break;
                }
            }
            if(!present){
                System.out.println(small);
                return;
            }
            present=false;
        }
        System.out.println(-1);
    }
}