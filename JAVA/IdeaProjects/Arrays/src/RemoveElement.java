//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
//Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
//Return k after placing the final result in the first k slots of nums.
// Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
public class RemoveElement {
    public static void main(String[] args) {
        int nums[]={0,1,2,2,3,0,4,2}, val=2,i,j,k=0,temp;
        for(i=0;i<nums.length;i++)
            if(nums[i]==val)
                k++;
        for(i=0;i< k;i++){
            for(j=0;j< nums.length-i-1;j++){
                if(nums[j]==val ){//&& nums[j+1]!=val ){     //swapping
                    //k++;
                    temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
                //System.out.println(j+" j");
            }
        }
        print(nums, nums.length-k);
    }
    public static void print(int nums[],int k){
        for(int i=0;i< nums.length;i++)
            System.out.println(nums[i]);
        System.out.println(k+" k");
    }
}
