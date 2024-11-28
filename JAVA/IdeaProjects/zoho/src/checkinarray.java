import java.util.Scanner;
public class checkinarray {
    public static void main(String []args)
    {
        int []a={1,2,3,4,5};
        int n,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter len ");
        n=sc.nextInt();
        System.out.println("no to be checked ");
        f=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if (a[i]==f){
            System.out.println("yes");
            break;}
        }

    }
}
