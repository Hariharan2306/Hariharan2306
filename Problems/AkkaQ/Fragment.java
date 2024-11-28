public class Fragment {
    //yet to cmplete
    public static void main(String[] args) {
        String s1 = "Every morning I want to do Exercise";
        String s2 = "Every morning  want to do meditation without fail";
        String s3 = "It is important that I want to be happy always";
        int n = 3;
        int i, j, k;
        String[] sArr = { s1, s2, s3 };
        System.out.println(fragments(s1, 1, sArr));
    }

    static boolean fragments(String s, int n, String[] sArr) {
        int i, subLoopStart = 0, k = 0, j;
        String op = "";
        int space = 0, minSpace = 0, maxSpace = 3;
        for (i = 0; i < s.length(); i++) {
            if (i != 0 && s.charAt(i) == ' ')
                space++;
            if (space >= minSpace && space < maxSpace) {
                if (space == minSpace)
                    subLoopStart = i + 1;
                op += s.charAt(i);
            } else {
                // space = 0;
                minSpace++;
                maxSpace++;
                // System.out.println(op);
                // System.out.println((minSpace - 1) + " " + (maxSpace - 1) + " " + space);
                // System.out.println();
                boolean flag = false;
                for (j = 0; j < sArr.length; j++) {
                    if (j != n)
                        flag = subStr(op, sArr[j]);
                    if (j == sArr.length - 1 && flag)
                        return true;
                }
                flag = false;
                op = "";
                i = subLoopStart;
                space = ++k;
            }
        }
        return false;
    }

    static boolean subStr(String sub, String string) {
        int i, j = 0, k;
        System.out.println(sub + " abc");
        for (i = 0; i < string.length(); i++) {
            k = i;
            while (i < string.length() && sub.charAt(j) == string.charAt(i)) {
                if (j == sub.length() - 1) {
                    // System.out.println(true + " " + sub);
                    return true;
                }
                j++;
                i++;
            }
            j = 0;
            i = k;
        }
        // System.out.println(true + " " + sub);
        return false;
    }
}
