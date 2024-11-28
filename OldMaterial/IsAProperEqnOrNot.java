package OldMaterial;
import java.util.Stack;
public class IsAProperEqnOrNot {
    public static void main(String[] args) {//done
        String a="a+b)";
        Stack <Character>str=new Stack<>();
        int i;
        for(i=0;i<a.length();i++){
            boolean isOp=(a.charAt(i)=='+' || a.charAt(i)=='-' || a.charAt(i)=='/' || a.charAt(i)=='*');

            if(a.charAt(i)=='(')
                str.push(a.charAt(i));
            else if(a.charAt(i)==')' && str.empty()){
                System.out.println(") has no pair ");
                return;
            }
            else if(a.charAt(i)==')' && !str.empty())
                str.pop();
            else if(i==a.length()-1 && !str.empty()){
                System.out.println("stack not empty");
                return;}
            else if(i==a.length()-1 && isOp){
                System.out.println("op in last position");
                return;
            }
            else if(isOp && !(a.charAt(i+1)>='a' && a.charAt(i+1)<='z')){
                System.out.println("not having a operand after a op ");
                return;
            }
        }
        System.out.println("is a proper eqn");
    }
}
