package LeetCode.Patterns;

import java.util.Scanner;
public class Pattern6 {
    //fibonacci concept
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter val fro n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            a=0;
            b=1;
            System.out.print(b);
            for(int j=1;j<i;j++){
                c=a+b;
                System.out.print(c);
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}
