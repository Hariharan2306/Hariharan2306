import java.util.Arrays;
public class MergingArray {
    //merging two gn unsorted arrays and sorting them
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0}, nums2[] = {2,5,6};
        int m = 3, n = 3,i,minIdx,j,temp;
        for(i=0;i<n;i++,m++)
            nums1[m]=nums2[i];
        Arrays.sort(nums1);
        //        for(i=0;i< nums1.length;i++){ //selection sort
//            minIdx=i;
//            for(j=i+1;j< nums1.length;j++)
//                if(nums1[minIdx] > nums1[j])
//                    minIdx=j;
//            temp=nums1[minIdx];
//            nums1[minIdx]=nums1[i];
//            nums1[i]=temp;

//        }
        for(i=0;i< nums1.length;i++)
            System.out.println(nums1[i]);
    }
}
