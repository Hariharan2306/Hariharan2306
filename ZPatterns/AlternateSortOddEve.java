package ZPatterns;

public class AlternateSortOddEve {
    public static void main(String[] args) {
        int[] a = { 3, 4, 5, 1, 2 };
        // op {5,2,3,1,4}

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] % 2 != 0 && a[j] % 2 != 0 && a[i] > a[j] || a[i] % 2 == 0 && a[j] % 2 == 0 && a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int el : a)
            System.out.print(el + " ");
    }
}
