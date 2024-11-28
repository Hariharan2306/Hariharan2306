package LeetCode.Algorithms;

public class QuickSort {
    public static void main(String[] args) {
        int[] a={0,-1,2,0,7,6,3};
        quickSort(0,a.length-1,a);
        int i=0;
        while (i<a.length)
            System.out.print(a[i++]+" ");
    }
    private static void quickSort(int low,int high,int[] a){
        int partition;
        if(low<high) {
            partition=partition(low,high,a);
            quickSort(low, partition - 1, a);
            quickSort(partition + 1, high, a);
        }
    }
    private static int partition(int low,int high,int[] a){
        int pivot=a[high];
        int i=low-1,j;
        int temp;

        for(j=low;j<high;j++){
            if(a[j]<pivot){ 
                i++;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;

        return i+1;
    }
}