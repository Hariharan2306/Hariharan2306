package OldMaterial;
public class DuplicateNumbers {
//    Store the duplicate numbers in a separate array and print the output.
//    Input : [ 1, 2, 4, 5, 2, 1, 5, 2, 10, 22, 5 ]
//    Output:
//            1 -> 2
//            2 -> 3
//            5 -> 3
    public static void main(String[] args) {
        int[] a={1, 2, 4, 5, 2, 1, 5, 2, 10, 22, 5};
        int i,j,k=0,count=1;
        int[] repeat=new int[a.length];
        int[] freq=new int[a.length];
        for(i=0;i<a.length;i++){
            for(j=i+1;j< a.length;j++){
                if(a[i]==a[j] && a[i]!=-1){
                    repeat[k]=a[i];
                    a[j]=-1;
                    count++;
                }
            }
            freq[k]=count;
            k++;
            count=1;
        }
        for(i=0;i< repeat.length;i++){
            if(repeat[i]!=0)
                System.out.println(repeat[i]+"->"+ freq[i]);
        }
    }
}
