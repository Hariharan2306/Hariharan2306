package Problems;

public class PallindromeNum {
    public static void main(String[] args) {
        int n = 8008, num = 0, rem, k;
        k = n;
        while (k > 0) {
            rem = k % 10;
            num = num * 10 + rem;
            k /= 10;
        }
        System.out.println(num == n);
    }
}
// 123