package LeetCode;


public class AlternateSortIndiced {
    // SOrt odd *positions* as desc, eve positions asc
    public static void main(String[] args) {
        int[] n = { 3, 4, 5, 1, 2 };
        // 5 1 3 4 2

        int[] a = new int[n.length];
        int i,j,k;
        for(i=0;i<n.length-1;i+=2){
            for(j=0;j<n.length-i-1;j+=2){
                if(j%2==0 && n[j] <= n[j+2]){
                    k = n[j+2];
                    n[j+2] = n[j];
                    n[j] = k;
                }
            }
        }
        for(i=1;i<n.length-1;i+=2){
            for(j=1;j<n.length-i-1;j+=2){
                if(j%2!=0 && n[j] >= n[j+2]){
                    k = n[j+2];
                    n[j+2] = n[j];
                    n[j] = k;
                }
            }
        }
        i=0;
        while(i<n.length)
            System.out.print(n[i++]+" ");
    }    
}
