import java.util.Stack;
public class ValidMathEqn{
    public static void main(String[] args) {
        String s="(){a}[a+b]";
        boolean flag=false;
        Stack<Character> abc=new Stack<>();
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                abc.push(s.charAt(i));
            else{
                if(!abc.empty())
                {
                    if(s.charAt(i)=='*' || s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='/'){
                        if(i+1<s.length() && s.charAt(i+1)<='z'&& s.charAt(i+1)>='a')
                            flag=true;
                        else{
                            flag=false;
                            System.out.println("hi");
                            break;}
                    }
                    else if(!(s.charAt(i)<='z'&& s.charAt(i)>='a') && abc.peek()=='(' && s.charAt(i)!=')' ||abc.peek()=='{' && s.charAt(i)!='}' || abc.peek()=='[' && s.charAt(i)!=']'){
                            flag=false;
                        System.out.println("helo");
                            break;
                    }
                    else
                        abc.pop();
                }
                else{
                    flag=false;
                    System.out.println("hola");
                    break;
                }
            }
        }
        System.out.println(flag);
    }
}