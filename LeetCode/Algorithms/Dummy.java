package LeetCode.Algorithms;

public class Dummy {
    public static void main(String[] args) {
        int a[] = { 0, 0, 0, 1, 2, 2, 3, 6 };
        int search = 2;
        int op = binarySearch(a, 0, a.length - 1, search);
        System.out.println(op);
    }

    private static int binarySearch(int[] a, int start, int end, int search) {
        if (a.length == 0)
            return -1;
        // System.out.println(a[mid]);
        if (start <= end) {
            int mid = start + (end - 1) / 2;
            if (search == a[mid])
                return mid;
            if (search < a[mid])
                return binarySearch(a, start, mid - 1, search);
            return binarySearch(a, mid + 1, end, search);
        }
        return -1;
    }
}
