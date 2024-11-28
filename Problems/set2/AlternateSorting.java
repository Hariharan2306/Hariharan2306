package Problems.set2;

public class AlternateSorting {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        // {7, 1, 6, 2, 5, 3, 4}
        int i = a[0], j = a[a.length - 1], k = 0;
        while (i < j) {
            a[k++] = j--;
            a[k++] = i++;
        }
        if (i - 1 != j)
            a[k] = i;
        i = 0;
        while (i < a.length)
            System.out.print(a[i++] + " ");
    }
}
