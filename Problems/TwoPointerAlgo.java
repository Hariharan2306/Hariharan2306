import java.util.Arrays;

public class TwoPointerAlgo {
    public static void main(String[] args) {
        int[] a = { 2, 3, 5, 8, 9, 10, 11 };
        int i = 0, j = a.length - 1, n = 17;
        Arrays.sort(a);

        while (i < j) {
            if (a[i] + a[j] == n) {
                System.out.print(i + " " + j);
                return;
            } else if (a[i] + a[j] < n)
                i++;
            else
                j--;
        }
        System.out.println("failed");
    }
}
