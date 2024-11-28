package LeetCode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LonelyNums {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        int[] nums = {75,35,59,66,69,53,37,16,60,98,11,33,3,85,59,65,59,44,34,89,72,47};
        int i,j;
        boolean alone = true;

        for(i=0;i<nums.length;i++){
            for(j=0;j<nums.length;j++){
                boolean notLoneNum = i!=j && nums[i] != -1 && (nums[j] == nums[i]-1 || nums[j] == nums[i]+1 || nums[j] == nums[i]);
                if(notLoneNum)
                    alone = false;
            }
            if(alone )
                li.add(nums[i]);
            alone = true;
        }
        System.out.println(li);
    }
    // alternate method
    // public static void main(String[] args) {
    //     List<Integer> li = new ArrayList<>();
    //     HashMap<Integer, Integer> map = new HashMap<>();

    //     int[] nums = {75,35,59,66,69,53,37,16,60,98,11,33,3,85,59,65,59,44,34,89,72,47};

    //     for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);
    //     for(int i:nums)
    //      if(map.get(i)==1 && !map.containsKey(i-1) && !map.containsKey(i+1))
    //         li.add(i);
         
    //     System.out.println(li);
    // }
}
