import java.util.Scanner;
public class Arrayhighlow {
    public static void main()
    {
        int n,b;
        System.out.println("enter no elements ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []a={10,2,7,6,13};
        //for(int i=0;i<n;i++)
        //    a[i]=sc.nextInt();
        for(int i=0;i<=n;i++)
            if(a[i]<a[i+1])
                b=a[i+1];
       // System.out.println(b);
    }
}
