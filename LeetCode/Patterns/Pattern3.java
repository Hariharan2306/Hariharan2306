package LeetCode.Patterns;

import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter val fro n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int k=n-i+1;
            for(int j=1;j<=n-i+1;j++){
                System.out.print(k);
                k--;
            }
            System.out.println();
        }
    }
}
