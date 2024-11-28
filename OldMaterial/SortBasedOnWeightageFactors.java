package OldMaterial;
public class SortBasedOnWeightageFactors {
//    To find the factors of the numbers given in an array and to sort the numbers in
//    descending order according to the factors present in it.
//    Input:
//    Given array : 8, 2, 3, 12, 16
//    Output:
//            12, 16, 8, 2, 3
    public static void main(String[] args) {
        int[] arr={8, 2, 3, 12, 16};
        int[] wt=new int[arr.length];
        int count,j,i;
        for(i=0;i<arr.length;i++){
            count=0;
            j=2;
            while(j<arr[i]){
                if(arr[i]%j==0)
                    count++;
                j++;}
            wt[i]=count;
        }
        int temp,temp1;
        for(i=0;i< arr.length-1;i++){
            for(j=0;j< arr.length-1-i;j++){
                if(wt[j]<=wt[j+1]){
                 temp=arr[j];temp1=wt[j];
                 arr[j]=arr[j+1];wt[j]=wt[j+1];
                 arr[j+1]=temp;wt[j+1]=temp1;
                }
            }
        }
        for(i=0;i< arr.length;i++)
            System.out.println(arr[i]+" "+wt[i]);
    }
}