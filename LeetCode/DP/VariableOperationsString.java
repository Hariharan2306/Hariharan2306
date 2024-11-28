package LeetCode.DP;

public class VariableOperationsString {
    public static void main(String[] args) {

        int x = 0, i;
        String[] o = { "--X", "X++", "X++" };

        for (i = 0; i < o.length; i++) {
            if (o[i].charAt(0) == '-' || o[i].charAt(o[i].length() - 1) == '-')
                x--;
            else if (o[i].charAt(0) == '+' || o[i].charAt(o[i].length() - 1) == '+')
                x++;
        }
        System.out.println(x + " x");
    }
}
