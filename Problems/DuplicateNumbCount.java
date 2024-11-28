
public class DuplicateNumbCount {
    public static void main(String[] args) {
        // Input : [ 1, 2, 4, 5, 2, 1, 5, 2, 10, 22, 5 ]
        // Output:
        // 1 -> 2
        // 2 -> 3
        // 5 -> 3
        int i, j, k = 1;
        int[] a = { 1, 2, 4, 5, 2, 1, 5, 2, 10, 22, 5 };
        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && a[i] != -1) {
                    k++;
                    a[j] = -1;
                }
            }
            if (k != 1)
                System.out.println(i + " -- " + k);
            k = 1;
        }
    }
}
