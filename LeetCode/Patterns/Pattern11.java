package LeetCode.Patterns;

import java.util.Scanner;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr val for n ");
        int n=sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            if(i<=n)
                for(int j=1;j<=i;j++)
                    System.out.print(j);
                //System.out.println();
            else
                for(int j=1;j<=2*n-i;j++)
                    System.out.print(j);
            System.out.println();
        }
    }
}
