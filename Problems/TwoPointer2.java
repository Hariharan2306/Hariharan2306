public class TwoPointer2 {
    public static void main(String[] args) {
        int[] a = { 2, 2, 3, 4, 4, 5, 8, 9, 9, 10, 11 };
        int i = 0, k = 0;
        while (i + 1 < a.length) {
            if (a[i] != a[i + 1])
                a[k++] = a[i++];
            else
                i++;
        }
        for (i = 0; i < k; i++)
            System.out.print(a[i] + " ");
    }
}
