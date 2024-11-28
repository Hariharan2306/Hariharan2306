package LeetCode.Patterns;

import java.util.Scanner;
public class XPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String value to be printed ");
        String a=sc.nextLine();
        int i,j;
        for(i=0;i<a.length();i++){
            for(j=0;j<a.length();j++){
                if(i==j)
                    System.out.print(a.charAt(i));
                else if(j==a.length()-1-i)
                    System.out.print(a.charAt(a.length()-1-i));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

