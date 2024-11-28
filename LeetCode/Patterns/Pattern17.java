package LeetCode.Patterns;

import java.util.Scanner;
public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter val for n");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) {
                if (j <= n - i)
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
