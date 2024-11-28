package LeetCode.Patterns;

public class Monday {
       public static void main(String[] args) {
           int i, j, n=4;
           //"enter value for n ";
           for (i = 1; i <= n; i++) {
               int k = n;
               for (j = 1; j <= 2 * n - 1; j++) {
                   k--;
                   if (j <= n - i) {
                       System.out.print(" ");
                   } else if (j <= n)
                       System.out.print(k);
                   else if (j <= n + i - 1) {
                       k+=2;
                       //k++;
                       System.out.print(k);
                   }
               }
               System.out.print("\n");
           }
       }
}