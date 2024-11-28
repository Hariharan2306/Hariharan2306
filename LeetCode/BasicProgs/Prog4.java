package LeetCode.BasicProgs;

import java.util.Scanner;
public class Prog4 {
    public static void main(String[] args) {
        //factorial of a number
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no to find its factorial ");
        int n=sc.nextInt();
        int a=1;
        do {
            a *= n;
            n--;
            //System.out.println(n+"n");
        }while(n>=2);
        System.out.println(a);
    }
}

// 1* 2* 3* 4* 5
