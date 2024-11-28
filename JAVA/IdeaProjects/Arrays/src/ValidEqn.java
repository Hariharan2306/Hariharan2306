import java.util.Stack;
public class ValidEqn {
    //with paranthesis
    public static boolean eqn(String s) {
        int i;
        Stack <Character>a=new Stack<>();
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                a.push(s.charAt(i));
            else if(!a.empty() && s.charAt(i)==')')
                a.pop();
            else if((s.charAt(i)=='*' || s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='/') && s.charAt(i)==s.charAt(i+1))//consecutive op
                return false;
            else if(s.charAt(0)=='+' && s.charAt(0)=='*' && s.charAt(0)=='/')//frst op
                return false;
            else if(s.charAt(s.length()-1)=='+' || s.charAt(s.length()-1)=='-' || s.charAt(s.length()-1)=='*' || s.charAt(s.length()-1)=='/')//lat char shdnt be op
                return false;
            else if(s.charAt(i)=='*' && s.charAt(i)=='+' && s.charAt(i)=='-' && s.charAt(i)=='/' && (s.charAt(i+1)>='a' && s.charAt(i+1)<='z'))//aftr op only char
                return true;
            else if(!a.empty())return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="(a-b)(a+b)";
        System.out.println(eqn(s));
    }
}
