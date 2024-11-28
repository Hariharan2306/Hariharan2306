package LeetCode.Patterns;

import java.util.Scanner;
//printing column wise zoho asked
public class ColumnPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,k=0;
        System.out.println("enter no of rows and columns ");
        int n =sc.nextInt();
        for(i=1; i<= n; i++){
            k=i;
            for(j=1; j<= n; j++){
                System.out.print(k+" ");
                k+=n;
            }
            System.out.println();
        }
    }
}
//1 4 7
//2 5 8
//3 6 9