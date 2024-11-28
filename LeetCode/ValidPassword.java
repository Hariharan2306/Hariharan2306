package LeetCode;


import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // System.out.println("enter String ");
        // String pass = sc.next();
        String pass = "aB3&efgh";

        boolean hasSmall, hasCaps, hasSymbol, hasNum;

        hasSmall= hasCaps= hasSymbol= hasNum = false;

        if(pass.length() < 8){
            System.out.println("Not valid ");
            return;
        }
        for(char c : pass.toCharArray()){
            if(c <='9' && c >='0' )
                hasNum = true;
            else if(c <='z' && c >='a' )
                hasSmall = true;
            else if(c <='Z' && c >='A' )
                hasCaps = true;
            else
                hasSymbol = true;
        }
        if(!(hasSmall && hasCaps && hasSymbol && hasNum)){
            System.out.println("Not Valid");
            return;
        }
        System.out.println("Valid pass");
        sc.close();
    }
}
