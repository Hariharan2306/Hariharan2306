import java.util.Scanner;
public class BinarySearchRecursion {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int n = a.length;
        //int mid=n/2;
        Scanner sc = new Scanner(System.in);
        System.out.println("no to be found ");
        int x = sc.nextInt();
        //BinarySearchRecursion ob = new BinarySearchRecursion();
        int result = binary(a, 0, n - 1, x);
        if (result == -1)
            System.out.println("no not in array ");
        else
            System.out.println("element found " + result);
    }
    static int binary(int a[], int l, int k, int x) {
        if (k >= l) {
            int mid = a.length / 2;
            if (a[mid] == x)
                return mid;
            if (a[mid] > x)
                return binary(a, l, mid - 1, x);
            return binary(a, mid + 1, k, x);
        }
        return -1;
    }
}