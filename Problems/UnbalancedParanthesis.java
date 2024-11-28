public class UnbalancedParanthesis {
    public static void main(String[] args) {
        String s = "(a(b)))(c(d)";
        char[] a = toArray(s);
        int i = 0, j = s.length() - 1, open = 0, close = 0;

        while (i < s.length()) {
            if (a[i] == '(')
                open++;
            else if (a[i] == ')')
                open--;
            if (a[j] == ')')
                close++;
            else if (a[j] == '(')
                close--;

            if (open < 0) {
                a[i] = '1';
                open = 0;
            }
            if (close < 0) {
                a[j] = '1';
                close = 0;
            }
            i++;
            j--;
        }
        i = 0;
        String op = "";
        while (i < s.length()) {
            if (a[i] != '1')
                op += a[i];
            i++;
        }
        System.out.println(op);
    }

    private static char[] toArray(String s) {
        char[] arr = new char[s.length()];
        int i = 0;
        while (i < arr.length) {
            arr[i] = s.charAt(i);
            i++;
        }
        return arr;
    }
}
// Eg.) Input : ((abc)((de))
// Output : ((abc)(de))

// Input : (a(b)))(cd)
// Output : (a(b))(cd)

// Input : (a(b)))(c(d)
// Output : (a(b))(cd)

// Input : (ab))(c(d))))
// Output : (ab)(c(d))

// Input : (((ab)
// Output : (ab)