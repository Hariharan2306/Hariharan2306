package OldMaterial;
public class MergeAndSortNoRepeat {
//    Given two sorted arrays, merge them such that the elements are not repeated
//
//    Eg 1: Input:
//    Array 1: 2,4,5,6,7,9,10,13
//    Array 2: 2,3,4,5,6,7,8,9,11,15
//    Output:
//    Merged array: 2,3,4,5,6,7,8,9,10,11,13,15
    public static void main(String[] args) {
        int[] a1={2,4,5,6,7,9,10,13};
        int[] a2={2,3,4,5,6,7,8,9,11,15};
        int[] a3=new int[a1.length+a2.length];
        int i=0,j=0,k=0;

        while(i< a1.length && j<a2.length){
            if(a1[i] < a2[j])
                a3[k++]=a1[i++];
            else if(a2[j] < a1[i])
                a3[k++]=a2[j++];
            else if (a1[i]==a2[j]){
                a3[k++]=a1[i];
                i++;
                j++;
            }
        }
//        System.out.println(i+" i "+j+" j");
//        System.out.println(a1[8]);
        while (i<a1.length)
            a3[k++]=a1[i++];

        while (j<a2.length)
            a3[k++]=a2[j++];

        for(i=0;i<a3.length;i++)
            System.out.print(a3[i]+" ");

        //removing last zeroes

        System.out.println();

        // to find last index w/o zero
        for(i=0;i<=removeZeroes(a3);i++)
            System.out.print(a3[i]+" ");
    }
    public static int removeZeroes(int[] a3){
        int idx=0;
        for(int n=a3.length-1;n>=0;n--){
            if(a3[n]!=0){
                idx=n;
                break;
            }
        }
        return idx;
    }
}
