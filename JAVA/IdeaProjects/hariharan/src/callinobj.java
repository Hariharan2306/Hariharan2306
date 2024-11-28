import java.util.Scanner;
public class callinobj {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a ");
        a=scanner.nextInt();
        callinobj obj = new callinobj();
        boolean result= obj.if_condition(a);
        if(result==true)
            System.out.println("divisible ");
        else
            System.out.println("not divisible");

    }
    public boolean if_condition (int a) {
            if (a % 5== 0)
            {
                return true;
            }
            else
            {
                return false;
            }
    }
    }


