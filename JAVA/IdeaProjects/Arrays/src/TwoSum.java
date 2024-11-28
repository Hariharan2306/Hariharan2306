//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order
//Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class TwoSum {
    public static void main(String[] args) {
        int []nums={3,3};
        int target =6,i=0,j=0;
        while(true){
            if (nums[i]+nums[j]==target && j!=i){
                System.out.println(i+" "+j);
                break;}
            j++;
            if(j== nums.length-1){
                j=0;
                i++;}
        }
    }
}
