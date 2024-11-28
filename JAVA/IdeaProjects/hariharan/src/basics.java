public class basics
{
    public static void main(String [] args)
    {
       int a=10,b=0;
       try
       {
           System.out.println(a/b);
    }
       catch(Exception c)
        {
            System.exit(0);
            //c.printStackTrace();
           System.out.println("enter another value for b");
            //break;
       }
       finally
       {
           System.out.println("any number divided by zero is always infinity");
       }
    }
}
