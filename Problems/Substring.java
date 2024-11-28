public class Substring {
    public static void main(String[] args) {
        String a = "String", s = "k";
        int i, j = 0, k;

        for (i = 0; i < a.length(); i++) {
            k = i;
            while (a.charAt(i) == s.charAt(j) && i < a.length()) {
                if (j == s.length() - 1) {
                    System.out.println(true);
                    return;
                }
                i++;
                j++;
            }
            i = k;
            j = 0;
        }
        System.out.println(false);
    }
}
