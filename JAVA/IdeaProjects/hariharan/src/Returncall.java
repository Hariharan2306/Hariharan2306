import java.util.Scanner;
public class Returncall {
    public static void main(String[] args) {
        int i = 0;
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a ");
        a = scanner.nextInt();
        Returncall object=new Returncall();
        object.callclass(a);
    }
    public void callclass(int a){
        int i;
        for(i=0;i<=a;i++) {
            System.out.println(i);
            if (i % 7 == 0)
                System.out.println("divisble");
            else
                System.out.println("not divisible ");}return;}}
