package LeetCode.BasicProgs;

import java.util.Scanner;
public class RepeatedScan{
    /*Write a program to give the following output for the given input

    Eg 1: Input: a1b10
           Output: abbbbbbbbbb
    Eg: 2: Input: b3c6d15
              Output: bbbccccccddddddddddddddd
    The number varies from 1 to 99.*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        String op="";
        int noOfIP=sc.nextInt();
        for(i=1;i<=noOfIP;i++){
            char alph=sc.next().charAt(0);
            int nTimes=sc.nextInt();
            for( j=1;j<=nTimes;j++)
                op+=alph;
        }
        System.out.println(op);
    }
}



