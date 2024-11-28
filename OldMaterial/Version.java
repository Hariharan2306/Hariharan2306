package OldMaterial;

public class Version {
    public static void main(String[] args) {
        String v1 = "1.0";
        String v2 = "1.0.0";
        int i = 0, j = 0;
        String v1Num = "", v2Num = "";

        while (i < v1.length() || j < v2.length()) {

            while (i < v1.length() && v1.charAt(i) != '.') {
                v1Num += v1.charAt(i);
                i++;
            }

            while (j < v2.length() && v2.charAt(j) != '.') {
                v2Num += v2.charAt(j);
                j++;
            }
            if (v2Num.equals("")) {
                System.out.println("down");
                return;
            }

            if (v1Num.equals("")) {
                System.out.println("up");
                return;
            }

            if (Integer.parseInt(v1Num) > Integer.parseInt(v2Num)) {
                System.out.println("downgraded");
                return;
            } else if (Integer.parseInt(v2Num) > Integer.parseInt(v1Num)) {
                System.out.println("upgraded");
                return;
            }

            v1Num = "";
            v2Num = "";
            i++;
            j++;
        }
        System.out.println("same");
    }
}