package LeetCode.BasicProgs;

import java.util.Scanner;
public class Prog1{
    //fibonacci
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        //fibonacci n terms
        System.out.println("enter no of terms ");
        int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a +","+ b);
        for(int i=1;i<=n-2;i++){
            c=a+b;
            System.out.print(","+c);
            a=b;
            b=c;
        }
        main1();
    }
    public static void main1(){
        //fibonacci till n
        System.out.println("\n enter no till ");
        int n1=sc.nextInt();
        int a=0,b=1,c=a+b;
        System.out.print(a + "," + b);
        while(c<=n1){
            System.out.print("," + c);
            a=b;
            b=c;
            c=a+b;
        }
    }
}