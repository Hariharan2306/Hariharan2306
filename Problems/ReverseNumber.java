public class ReverseNumber {
    public static void main(String[] args) {
        int a = 1009;
        int c = a, n = 0, r;

        while (c != 0) {
            r = c % 10;
            n = n * 10 + r;
            c = c / 10;
            System.out.println(n);
        }
    }
}