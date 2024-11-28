package OldMaterial;
import java.util.Scanner;
public class RemoveZero {
//    Given two numbers and an operation either + or – , perform the operation.
//    Now remove any zeros if present in the two numbers and perform an operation. See if the result obtained is same or not after
//    removing zero’s in the original result.
    public static void main(String[] args) {
        int n1=203;
        int n2=300;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the operator");
        String op=sc.next();

        int n1WOZero=removeZeroes(n1);
        int n2WOZero=removeZeroes(n2);

//        String n1WOZero=String.valueOf(n1);//using inbuilt method
//        n1WOZero=n1WOZero.replaceAll("0","");
//
//        String n2WOZero=String.valueOf(n2);
//        n2WOZero=n2WOZero.replaceAll("0","");

        System.out.println(operation(n1,n2,op)==operation(n1WOZero,n2WOZero,op));

//        System.out.println(operation(n1,n2,op)==operation(Integer.parseInt(n1WOZero),Integer.parseInt(n2WOZero),op));
    }
    private static int operation(int n1, int n2,String op) {
        switch (op){
            case "+":
                return n1+n2;
            case "-":
                return n1-n2;
        }
        return -1;
    }
    private static int removeZeroes(int n){
        String nStr=String.valueOf(n);
        char[] numArr=new char[nStr.length()];
        int i;
        for(i=0;i< numArr.length;i++)
            numArr[i]=nStr.charAt(i);
        String newNum="";
        for(i=0;i< numArr.length;i++){
            if(numArr[i]!='0')
                newNum+=numArr[i];
        }
        return Integer.parseInt(newNum);
    }
}
