package LeetCode.Algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int []a={2,3,0,6,2,0,0,1};
        int i,j,min,temp;
        for(i=0;i<a.length;i++){
            min=i;
            for(j=i+1;j<a.length;j++){
                if(a[j]<a[min])
                    min=j;
            }
            temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
        for(i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}