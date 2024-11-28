package set1;

public class SortBasedonWt {
    public static void main(String[] args) {
        int[] a = {10, 36, 54,89,12}, op = new int[a.length];
        int i,j,k;

        for(i=0;i<a.length;i++){
            if(perfectSquare(a[i]))
                op[i] += 5;
            if(a[i]%4 == 0 && a[i]%6 == 0)
                op[i] += 4;
            if(a[i]%2 == 0)
                op[i] += 3;
        }
        sort(a, op);
    }
    static void sort(int[] a,int[] op){
        int i,j,t1,t2;
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length-i-1;j++){
                if(op[j] > op[j+1]){
                    t1 = op[j+1];     t2 = a[j+1];
                    op[j+1] = op[j];  a[j+1] = a[j];
                    op[j] = t1;       a[j] = t2;
                }
            }
        }
        for(i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    } 
    static boolean perfectSquare(int n){
        int i;
        for(i=1;i<=(int)Math.ceil(n/4);i++){
            if( i*i == n)
                return true;
        }
        return false;
    }
}
//  Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
//     1. 5 if a perfect square
//     2. 4 if multiple of 4 and divisible by 6
//     3. 3 if even number

// And sort the numbers based on the weight and print it as follows