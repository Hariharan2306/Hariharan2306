package set2;

public class Scann {
    public static void main(String[] args) {
        // Eg 1: Input: a1b10
        // Output: abbbbbbbbbb
        String a = "a1b10";
        int i;
        String p = "", count = "";

        for (i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
                p += a.charAt(i);
            else {
                count += a.charAt(i);
                if (i == a.length() - 1 || a.charAt(i + 1) >= 'a' && a.charAt(i) <= 'z') {
                    print(p, Integer.parseInt(count));
                    p = count = "";
                }
            }
        }
    }

    static void print(String p, int count) {
        int i = 0;
        while (i < count) {
            System.out.print(p);
            i++;
        }
    }
}
