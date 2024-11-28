import java.util.Scanner;
public class Even_numbers {
public static void main (String[]args){
    boolean result = evenOrOdd(12);
//    ClassName objectName = new ClassName();
    Even_numbers obj = new Even_numbers();
    obj.defineStaticMethod();
//    defineStaticMethod();

    //xhhdf
}
//access_specifier static/no_static return_type method_name(parameters){}
public static boolean evenOrOdd(int limit){
    int i;
    int l = limit;
    for(i=1;i<=l;i++) {
        if (i % 2 == 0) {
            System.out.println("the even numbers " );
            System.out.println(i+"");
        } else {
            System.out.println("the odd numbers " );
            System.out.println(i+"");
            return false;
        }
    }
    return true;

}

public void defineStaticMethod(){
    return;
}

}
