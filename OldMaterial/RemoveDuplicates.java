package OldMaterial;
public class RemoveDuplicates {
    //works only if array doesn't have -1
    //doesn't require array to be sorted

    public static void main(String[] args) {
        int[] nums={0,0,0,0,3};
        int i,j,count=0;

        for(i=0;i< nums.length;i++){//to find all repeating elements and changing them as -1
            for(j=i+1;j< nums.length;j++){
                if(nums[i]==nums[j] && nums[i]!=-1) {
                    nums[j] = -1;
                    count++;//keeping count
                }
            }
        }
        int temp;
        for (i=0;i< nums.length-1;i++){//to move all -1 to last
            for(j=0;j< nums.length-i-1;j++){
                if(nums[j]==-1){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
//        System.out.println(count);
        for(i=0;i< nums.length-count;i++)
            System.out.print(nums[i]+" ");


//        another method does work, only on sorted array
//        int index = 1,k=1,i;
//        for (i = 0; i < nums.length - 1; i++) {
//            if (nums[i] != nums[i+1]) {
//                nums[index] = nums[i+1];
//                index++;
//                k++;
//            }
//        }
//        i=0;
//        while (i<k)
//            System.out.print(nums[i++]+" ");
    }
}