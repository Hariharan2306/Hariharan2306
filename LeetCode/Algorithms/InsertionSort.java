package LeetCode.Algorithms;

public class InsertionSort {
    public static void main(String[] args) {
        //dummy //insertion sort
        int a[]={2,3,0,6,2,0,0,1};
        int i,j,sortedUpto;
        for(i=1;i<a.length;i++){
            sortedUpto=a[i];
            for(j=i-1;j>=0 && a[j]>sortedUpto;j--){
                a[j+1]=a[j];
            }
            a[j+1]=sortedUpto;
        }
        for(i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
