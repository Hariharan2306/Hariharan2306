import java.util.Scanner;
public class Prg1 {
    //to change ' ' to '#'
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String val ");
        String b = sc.nextLine();
        //String b = "abc de";
        //char []c=b.toCharArray(); inbuilt method to convert String to array
        char[] c = new char[b.length()];
        for (i = 0; i < b.length(); i++)
            c[i] = b.charAt(i);
    checking(c,b);
    }
    public static void checking(char c[],String b) {
        for (int i = 0; i < c.length; i++)
            if (c[i] == ' ')
                c[i] = '#';
        print(c,b);
    }
    public static void print(char []c,String b){
        //for (int i=0;i<c.length;i++)//printing as array
        //    System.out.println(c[i]);
            //b=new String(c);//another method to convert char array to S(tring
            b=b.copyValueOf(c);
        System.out.println("\n"+b);
    }
}