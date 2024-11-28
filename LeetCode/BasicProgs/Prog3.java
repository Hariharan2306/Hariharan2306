package LeetCode.BasicProgs;

import java.util.Scanner;
public class Prog3 {
    public static void main(String[] args) {
        //palindrome no checking
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num to be checked ");
        int val=sc.nextInt();
        int rem,temp=0,num=val;
        while(num>0){
            rem=num%10;
            temp=(temp*10)+rem;
            num=num/10;
        }
        if(temp==val)
            System.out.println("is palindrome");
        else
            System.out.println("not");
    }
}
