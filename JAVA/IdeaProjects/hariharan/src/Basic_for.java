import java.util.Scanner;
public class Basic_for {
    public static void main (String[]args) {
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("enter value for i ");
//       int i=scanner. nextInt();
        int sum=0,a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter value for a");
        a=scanner.nextInt();

        for ( int i=0; i <= a; i++)
            sum=i+sum;{
         System.out.println(sum);


        }
    }}
//can we give i value in o/p
//post and pre increment explain