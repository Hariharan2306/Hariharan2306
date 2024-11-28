package OldMaterial;
import java.util.ArrayList;
public class NewDum {
//    Given a 0-indexed integer array nums, return true if it can be made strictly increasing
//    after removing exactly one element, or false otherwise. If the array is already strictly
//    increasing, return true.
//    The array nums is strictly increasing if nums[i - 1] < nums[i] for each index (1 <= i < nums.length).

//    Example 1:

//    Input: nums = [1,2,10,5,7]
//    Output: true
//    Explanation: By removing 10 at index 2 from nums, it becomes [1,2,5,7].
//            [1,2,5,7] is strictly increasing, so return true.
    public static void main(String[] args) {
//        not completed
        int[] nums={1,1,1};
        int count=0;
        ArrayList<Integer>op=new ArrayList<>();
        while (! op.contains(nums.length)){//must search does
            count++;
            op.add(asc(nums,op));
        }
        if(count<=2){
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
    static int asc(int[] nums,ArrayList<Integer> op){/*1,2,10,5,8,7,2*/
        int i,val1= nums[0];
        for(i=1; i< nums.length; i++){
            if(op.contains(i))
                continue;
            if(val1 >= nums[i]){
                System.out.println("not asc "+ nums[i-1]);
                if(i==nums.length-1)
                    return i;
                return i-1;
            }
            val1= nums[i];
        }
        System.out.println(nums[i-1]);
        return i;
    }
}