import java.util.Scanner;

public class RemoveZeroAfterOperation {
    // Given two numbers and an operation either + or – , perform the operation.
    // Now remove any zeros if present in the two numbers and perform an operation.
    // See if the result obtained is same or not after
    // removing zero’s in the original result.
    public static void main(String[] args) {
        int n1 = 203, n2 = 300;
        int a = removeZero(n1);
        int b = removeZero(n2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation to perform ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(a + b == n1 + n2);
                break;
            case '-':
                System.out.println(a - b == n1 - n2);
                break;
        }

    }

    private static int removeZero(int n) {
        int r, num = 0, i = 0;
        while (n != 0) {
            r = n % 10;
            if (r != 0) {
                num += (int) Math.pow(10, i) * r;
                i++;
            }
            n /= 10;
        }
        return num;
    }
}