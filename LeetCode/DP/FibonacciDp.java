package LeetCode.DP;

public class FibonacciDp {
    static int a = 0, b = 1, c;

    public static void main(String[] args) {
        int n = 7;
        System.out.print(a+" "+b+" ");
        fibonacci(n - 2);
    }

    private static void fibonacci(int n) {
        if (n != 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            fibonacci(n - 1);
        }
    }
}
