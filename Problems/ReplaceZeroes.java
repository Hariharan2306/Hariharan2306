public class ReplaceZeroes {
    public static void main(String[] args) {
        int n = 1009, factor = 1, r, c = 0;
        // op- 1559

        while (n != 0) {
            if (n % 10 == 0)
                c += factor * 5;
            else
                c += factor * (n % 10);
            n /= 10;
            factor *= 10;
        }
        System.out.println(c);
    }
}