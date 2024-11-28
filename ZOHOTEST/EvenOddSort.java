import java.util.Scanner;

public class EvenOddSort {
    public static void main(String[] args) {
        // int[] a = {3,4,5,1,2};
        // int[] a = {4,5,6,7,0,1,2};
        // int[] a = {11,13,15,17};
        // op {5,2,3,1,4}
        int[] a = getInput();
        int i,j;

        i = 0;
        while(i<a.length)
            System.out.print(a[i++] +" ");
        System.out.println();


        for(i=0;i<a.length;i++){
            // skip if not odd
            if(a[i] % 2 == 0)
                continue;
            for(j=0;j<a.length;j++){
                // skip if not odd
                if(a[j] % 2 == 0)
                    continue;
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for(i=0;i<a.length;i++){
            // skip if not even
            if(a[i] % 2 != 0)
                continue;
            for(j=0;j<a.length;j++){
                // skip if not even
                if(a[j] % 2 != 0)
                    continue;
                if(a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        i = 0;
        while(i<a.length)
            System.out.print(a[i++] +" ");
    }
    static int[] getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght of array ");
        int n  =sc.nextInt();
        int[] a = new int[n];
        int i = 0;

        while(i<n){
            System.out.println("Enter value "+ i+" index");
            a[i] = sc.nextInt();
            i++;
        }
        sc.close();
        return a;
    }
}
