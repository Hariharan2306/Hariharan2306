import java.util.Scanner;

public class DummyEncapsulation {
    public static void main(String[] args) {
        menu();
        get();
    }
    public static void menu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name ");
        String name=sc.next();

        System.out.println("Enter pass");
        String pass= sc.next();

        System.out.println("enter mob");
        String mob=sc.next();

        Data d=new Data(name,pass,mob);
        Database.db.put(name,d);
    }
    public static void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Given name");
        String name=sc.next();

        Data d=Database.db.get(name);
        System.out.println(d.getName());
        System.out.println(d.getPass());
        System.out.println(d.getMob());
    }
}