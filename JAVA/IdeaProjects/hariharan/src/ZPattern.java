public class ZPattern
{
    public static void main(String []args)
    {
        int i,n=5,j,a;
        for(i=1;i<=n;i++)
        {
            a=i;
            for(j=1;j<=i;j++) {
                System.out.print(a+" ");
                a+=n-j;
            }
            System.out.println();
        }
    }
}
