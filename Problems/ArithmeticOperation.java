public class ArithmeticOperation {
    public static void main(String[] args) {
        String a = "12345*+-+";
        int j = a.length() - 1, opIdx = -1;
        while (j >= 0) {
            if (a.charAt(j) >= '0' && a.charAt(j) <= '9') {
                opIdx = j + 1;
                break;
            }
            j--;
        }
        if (opIdx == -1 || opIdx <= a.length() / 2)
            System.out.println("not possible");

        int x = a.charAt(0) - 48;
        char op = a.charAt(opIdx);
        j = 0;

        while (opIdx < a.length() - 1) {
            switch (op) {
                case '+':
                    x += a.charAt(j) - 48;
                    break;
                case '*':
                    x *= a.charAt(j) - 48;
                    break;
                case '-':
                    x -= a.charAt(j) - 48;
                    break;
            }
            opIdx++;
        }
        System.out.println(x);
    }
}
