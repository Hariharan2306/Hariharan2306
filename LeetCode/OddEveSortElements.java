package LeetCode;


public class OddEveSortElements {
    // To Sort odd elements in desc order and eve elements in asc, without interrupting their intervals
    public static void main(String[] args) {
        int[] a = { 3, 4, 5, 1, 2 };
        // int[] a = { 4, 5, 6, 7, 0, 1, 2 };
        // 5 2 3 1 4 
        int i,j;

        for(i=0;i<a.length;i++){
            if(a[i]%2==0)
                continue;
            for(j=i;j<a.length;j++){
                if(a[j]%2==0)
                    continue;
                if(a[i]< a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }

            }
        }

        for(i=0;i<a.length;i++){
            if(a[i]%2!=0)
                continue;
            for(j=i;j<a.length;j++){
                if(a[j]%2!=0)
                    continue;
                if(a[i]> a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }

            }
        }

        i=0;
        while(i<a.length)
            System.out.print(a[i++]+" ");
    }
}
