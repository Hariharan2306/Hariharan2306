package LeetCode.Patterns;

import java.util.Scanner;
public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter val for n ");
        int n=sc.nextInt();
        int k;
        for(int i=1;i<=n;i++){
            k=i-1;
            for(int j=1;j<=2*n-1;j++){
                if(j<=n-i)
                    System.out.print(" ");
                else if(j<=n)
                    System.out.print(++k);
                else if(j<=n+i-1)
                    System.out.print(--k);
            }
            System.out.println();
        }
    }
}
