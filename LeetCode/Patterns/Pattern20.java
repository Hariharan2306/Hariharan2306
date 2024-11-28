package LeetCode.Patterns;

import java.util.Scanner;
public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter val fro n ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i-1)
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
