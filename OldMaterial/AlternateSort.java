package OldMaterial;
public class AlternateSort {
//    Write a program to sort the elements in odd positions in descending order and elements in ascending order
//
//    Eg 1: Input: 13,2 4,15,12,10,5
//    Output: 13,2,12,10,5,15,4
//    Eg 2: Input: 1,2,3,4,5,6,7,8,9
//    Output: 9,2,7,4,5,6,3,8,1

    public static void main(String[] args) {    //done
        int[] a={13,2,4,15,12,10,5};
        int i,j,temp;
        for(i=0;i<a.length-2;i+=2)
            for(j=0;j<a.length-2;j+=2){
                if(a[j]<a[j+2]){
                    temp=a[j+2];
                    a[j+2]=a[j];
                    a[j]=temp;
                }
            }
        for (i=1;i<a.length-2;i+=2)
            for(j=1;j<a.length-2;j+=2)
                if(a[j]>a[j+2]){
                    temp=a[j+2];
                    a[j+2]=a[j];
                    a[j]=temp;
                }
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}