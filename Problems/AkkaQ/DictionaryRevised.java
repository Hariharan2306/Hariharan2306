public class DictionaryRevised {
    public static void main(String[] args) {
        String[] s = { "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go",
                "mango" };
        String ip = "ilik";
        int i;
        int[] op = new int[ip.length()];

        for (i = 0; i < s.length; i++) {
            if (allPresent(op)) {
                System.out.println(true);
                return;
            }
            op = subStr(ip, s[i], op);
        }
        System.out.println(allPresent(op));
    }

    private static int[] subStr(String ip, String sub, int[] op) {
        int i, j = 0, k;
        for (i = 0; i < ip.length(); i++) {
            k = i;
            while (i < ip.length() && ip.charAt(i) == sub.charAt(j)) {
                if (j == sub.length() - 1) {
                    while (k <= i)
                        op[k++] = 1;
                    break;
                }
                i++;
                j++;
            }
            j = 0;
            i = k;
        }
        i = 0;
        return op;
    }

    static boolean allPresent(int[] op) {
        int i;

        for (i = 0; i < op.length; i++) {
            if (op[i] == 0)
                return false;
        }
        return true;
    }

}
