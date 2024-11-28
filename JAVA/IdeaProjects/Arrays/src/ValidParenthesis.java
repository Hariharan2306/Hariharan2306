import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "(){a}[]";
        Stack<Character> abc = new Stack<>();
        int i;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                abc.push(s.charAt(i));
            else {
                if (!abc.empty()) {
                    // if(s.charAt(i)<=0 || s.charAt(i)>0)
                    // continue;
                    if (abc.peek() == '(' && s.charAt(i) != ')' || abc.peek() == '{' && s.charAt(i) != '}'
                            || abc.peek() == '[' && s.charAt(i) != ']') {
                        System.out.println("false");
                        break;
                    } else
                        abc.pop();
                } else {
                    System.out.println("False");
                    break;
                }
            }
        }
        System.out.println("true");
    }
}