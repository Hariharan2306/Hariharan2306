public class Practise
{
    public static void main(String[] args)
    {
        int i,j,n=4,k=0,flag=1;
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n-i;j++)
                    System.out.print(" ");
                for(j=1;j<=2*i-1;j++)
                {
                    k++;
                    if(j<=i)
                    System.out.print(k);
                    else
                    {
                        k-=2;
                        System.out.print(k);
                    }
                }
                k=0;
                System.out.println("");
            }
    }
}