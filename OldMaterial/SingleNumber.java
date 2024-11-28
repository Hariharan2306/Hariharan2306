package OldMaterial;
public class SingleNumber {
//    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//    You must implement a solution with a linear runtime complexity and use only constant extra space.

//    Example 1:
//    Input: nums = [2,2,1]
//    Output: 1
    public static void main(String[] args) {
        int[] nums={4,1,2,1};
        int i,j;
        boolean notFound=true;
        for(i=0;i< nums.length;i++){
            notFound=true;
            for(j=0;j< nums.length;j++){
                if(nums[i]==nums[j] && i!=j){
                    notFound=false;
                    break;
                }
                else if(j== nums.length-1) {
                    System.out.print(nums[i]);
                    break;
                }
            }
            if(notFound)
                break;
        }
    }
}
