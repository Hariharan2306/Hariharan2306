package IntPractice;
import java.util.Scanner;

public class EvenOddSort {
    public static void main(String[] args) {
        // int[] a = {3,4,5,1,2};
        // int[] a = {4,5,6,7,0,1,2};
        // int[] a = {11,13,15,17};
        // op {5,2,3,1,4}
        int[] a = getInput();
        int i,j,temp;

        for(i=0;i<a.length;i++){
            for(j = i+1; j<a.length; j++){
                if( (a[i] %2 != 0 && a[j] %2 != 0 && a[i] < a[j]) || (a[i] %2 == 0 && a[j] %2 == 0 && a[i] > a[j])){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        i = 0;
        while(i<a.length)
            System.out.print(a[i++]+" ");
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
