public class MergeAndSortnoRepeat {
    // Eg 1: Input:
    // Array 1: 2,4,5,6,7,9,10,13
    // Array 2: 2,3,4,5,6,7,8,9,11,15
    // Output:
    // Merged array: 2,3,4,5,6,7,8,9,10,11,13,15
    public static void main(String[] args) {
        int[] a = { 2, 4, 5, 6, 7, 9, 10, 13 };
        int[] b = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 15 };
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else if (b[j] < a[i])
                c[k++] = b[j++];
            else if (a[i] == b[j]) {
                c[k++] = a[i];
                i++;
                j++;
            }
        }
        // System.out.println(i + " " + j);
        while (i < a.length)
            c[k++] = a[i++];
        while (j < b.length)
            c[k++] = b[j++];
        i = 0;
        while (i < c.length)
            System.out.print(c[i++] + " ");
    }
}
