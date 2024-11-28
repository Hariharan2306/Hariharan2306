package set2;

import java.util.Stack;

public class ValidMathEqn {
    public static void main(String[] args) {
        String s = "(ab)(ab+)";
        int i;
        Stack<Character> stack = new Stack<>();
        for (i = 0; i < s.length(); i++) {
            boolean isOp = s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/';
            if (s.charAt(i) == '(')
                stack.push('(');
            else if (s.charAt(i) == ')' && !stack.empty())
                stack.pop();
            else if (i == s.length() - 1 && isOp) {
                System.out.print(false+"hi");
                return;
            } else if (isOp && ! (s.charAt(i + 1) >= 'a' && s.charAt(i + 1) <= 'z')) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(stack.empty());
    }
}
