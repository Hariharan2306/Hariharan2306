public class RevStrSplChar {

    public static void main(String[] args) {
        char[] a = { 'a', 'v', '*', 'd', '@', '1' };
        // a {1,d,*,v,@,a}
        int i = 0, j = a.length - 1;
        char temp;
        while (i < j) {
            boolean isNotSymbolI = a[i] >= 'a' && a[i] <= 'z' || a[i] >= 'A' && a[i] <= 'Z'
                    || a[i] >= '0' && a[i] <= '9';
            boolean isNotSymbolJ = a[j] >= 'a' && a[j] <= 'z' || a[j] >= 'A' && a[j] <= 'Z'
                    || a[j] >= '0' && a[j] <= '9';

            if (isNotSymbolI && isNotSymbolJ) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            } else if (!isNotSymbolI)
                i++;
            else if (!isNotSymbolJ)
                j--;
        }
        i = 0;
        while (i < a.length)
            System.out.print(a[i++] + " ");
    }
}