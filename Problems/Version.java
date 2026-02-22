package Problems;

public class Version {
    public static void main(String[] args) {
        String v1 = "1.0.0";
        String v2 = "1.0";
        String a = "", b = "";
        int i = 0, j = 0;

        while (i < v1.length() || j < v2.length()) {
            while (i < v1.length() && v1.charAt(i) != '.') {
                a += v1.charAt(i);
                i++;
            }
            while (j < v2.length() && v2.charAt(j) != '.') {
                b += v2.charAt(j);
                j++;
            }
            if (b.equals("")) {
                System.out.println("downgrade");
                return;
            }
            if (a.equals("")) {
                System.out.println("upgrade");
                return;
            }
            if (Integer.parseInt(a) > Integer.parseInt(b)) {
                System.out.println("downgrade ");
                return;
            } else if (Integer.parseInt(b) > Integer.parseInt(a)) {
                System.out.println("upgrade");
                return;
            }
            a = b = "";
            i++;
            j++;
        }
    }
}
