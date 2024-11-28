package LeetCode;


public class PartitionArrayByPivot {
    // https://leetcode.com/problems/partition-array-according-to-given-pivot/
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int idx=0,pivot = 10;
        int[] arr = new int[nums.length];
        for(int i:nums)
            if(i<pivot)
                arr[idx++] = i;
        for(int i:nums)
            if(i==pivot)
                arr[idx++] = i;
        for(int i:nums)
            if(i>pivot)
                arr[idx++] = i;
        idx=0;
        while(idx<arr.length)
            System.out.print(arr[idx++]+" ");
    }
}
