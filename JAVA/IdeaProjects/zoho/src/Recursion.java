import java.util.Scanner;
public class Recursion {
    public static void main(String []args){
        //factorial in recursion
        Scanner sc=new Scanner(System.in);
        System.out.println("val to find factorial of ");
        int n=sc.nextInt();
        int i=n-1;
        Recursion obj =new Recursion();
        System.out.println(obj.factorial(i,n));
    }
    int factorial(int i,int n){
        n=n*i;
        i--;
        if(i==0)
            return n;
        else
            return factorial(i,n);
    }
}
