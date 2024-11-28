package LeetCode.Patterns;

import java.util.Scanner;
public class PascalsTriangle {
    //pascals triangle
    public static void main(String[] args) {
        int c,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter val for n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            k=1;
            c=1;
            for(int j=1;j<=n;j++){
                if(j<=n-i)
                    System.out.print(" ");
                else {
                    System.out.print(c+ " ");
                    c=c*(i-k)/k;
                    k++;
                }
            }
            /*c=1;
            for(int k=1;k<=i;k++){
                System.out.print(c+" ");
                c=c*(i-k)/k;
            }*/
            System.out.println();
        }
    }
}
