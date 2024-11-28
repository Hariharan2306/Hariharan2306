package Problems;

public class SlidingWindowALgo {
    public static void main(String[] args) {
        int[] a = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int i, k = 4, max = 0, curr;
        for (i = 0; i < k; i++)
            max += a[i];
            // System.out.println(max);
        curr = max;
        for (i = k; i < a.length; i++) {
            curr += a[i] - a[i - k];
            // System.out.println(curr);
            if (curr > max)
                max = curr;
        }
        System.out.println(max);
    }
}
