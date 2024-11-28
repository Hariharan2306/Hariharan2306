package OldMaterial;
public class PrintArrayAsAskd {
    //sometimes think outta box
    //can't sort this possibly as asked but can only be printed as asked
    public static void main(String[] args) {
        int[] a={1, 2, 3, 4, 5, 6, 7};
//        op={7, 1, 6, 2, 5, 3, 4}
        int i,j,temp;
        //only works for sorted arrays
        for(i=0;i<a.length-1;i++){//bubble sort
            for(j=0;j<a.length-1-i;j++){
                if(a[j]>=a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }//sorted
        i=0;
        j=a.length-1;
        while(i<j){
            System.out.print(a[j--]+" ");
            System.out.print(a[i++]+" ");
        }
        if(a.length % 2 != 0)
            System.out.print(a[i]+" ");
    }
}
