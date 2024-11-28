package LeetCode.BasicProgs;

import java.util.Scanner;
public class Prog10 {
    //is a String pallindrome or not
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String ");
        String a=sc.nextLine();
        String rev="",a1=a;
        char temp;
        for(int n=a.length()-1;n>=0;n--) {
            temp = a1.charAt(n);
            rev+=temp;
        }
        //System.out.println(rev+" "+a);
        if(a.equalsIgnoreCase(rev))
            System.out.println("is a String pallindrome ");
        else
            System.out.println("not a String palllindrome ");
    }
}
