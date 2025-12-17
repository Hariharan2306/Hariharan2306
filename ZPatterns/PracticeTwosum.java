package ZPatterns;

import java.util.HashMap;

public class PracticeTwosum {
  public static void main(String[] args) {
    int[] nums = { 2, 7, 11, 15 };
    int[] result = PracticeTwosum.twoSum(nums, 9);
    System.out.println(result[0] + " " + result[1]);
  }

  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i]))
        return new int[] { i, map.get(target - nums[i]) };
      map.put(nums[i], i);
    }
    return new int[] { 0, 0 };
  }
}