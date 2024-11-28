package LeetCode.BasicProgs;

import java.util.Scanner;
public class Prog5 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        //armstrong number or not
        System.out.println("enter no to be checked");
        int val= sc.nextInt();
        int temp,rem,sum=0;
        String s=String.valueOf(val);//type casting int to string DT
        int n=val;
        while(n>0){
            temp=1;
            rem=n%10;
            for (int i=1;i<=s.length();i++)
                temp*=rem;
            sum+=temp;
            n=n/10;
        }
        if(sum==val)
            System.out.println("is a armstrong number ");
        else
            System.out.println("not ");
    armstrong();
    }
public static void armstrong() {
    System.out.println("enter val till armstrong number must be printed ");
    int n = sc.nextInt();
    int rem, temp, sum = 0;
    System.out.println("the armstrong numbers are ");
    for (int i = 1; i <= n; i++) {
        int val = i;
        String s = String.valueOf(i);
        //System.out.println(s+1);
        while (val > 0) {
            temp = 1;
            sum=0;
            rem = val % 10;
            for (int j = 1; j <= s.length(); j++){
                //System.out.println(s.length());
                temp *= rem;}
            sum += temp;
            val = val / 10;
        }
        if (sum == i)
            System.out.println(i);
        //not working
        //System.out.println(sum+"sum \n\n");
    }
    }
}
