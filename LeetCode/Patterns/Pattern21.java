package LeetCode.Patterns;

public class Pattern21 {
    public static void main(String[] args) {
        int n=3;
        int i,j,k=n;
        for(i=1;i<=2*n-1;i++) {
            if(i<=n)
                --k;
            else
                ++k;
            for(j=1;j<=n;j++){
                if( j <= k  )
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//          *
//         * *
//        * * *
//         * *
//          *

