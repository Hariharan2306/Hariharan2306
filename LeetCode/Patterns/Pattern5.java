package LeetCode.Patterns;

import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args) {
        int k=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter val for n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(k++ +" ");
            System.out.println();
        }
    }
}
