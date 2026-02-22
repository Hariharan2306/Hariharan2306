package ZPatterns;

public class AlternateSortIndex {
    public static void main(String[] args) {
        int[] a = { 3, 4, 5, 1, 2 };
        // 5 1 3 4 2

        // odd sort
        for (int i = 0; i < a.length - 1; i += 2) {
            for (int j = 0; j < a.length - 1 - i; j += 2) {
                if (a[j] < a[j + 2]) {
                    int temp = a[j];
                    a[j] = a[j + 2];
                    a[j + 2] = temp;
                }
            }
        }
        // even sort
        for (int i = 1; i < a.length - 1; i += 2) {
            for (int j = 1; j < a.length - 1 - i; j += 2) {
                if (a[j] > a[j + 2]) {
                    int temp = a[j];
                    a[j] = a[j + 2];
                    a[j + 2] = temp;
                }
            }
        }

        for (int el : a)
            System.out.print(el + " ");
    }
}
