import java.util.Scanner;
public class ArrayScan{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of  elements");
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            System.out.print(a[i]);


    }
}