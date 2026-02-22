package ZPatterns;

public class Version {
    public static void main(String[] args) {
        String v1 = "10.0.1";
        String v2 = "10.0";
        // op -1

        int i = 0, j = 0;
        while (i < v1.length() || j < v2.length()) {
            int v1Str = 0, v2Str = 0;

            while (i < v1.length() && v1.charAt(i) != '.') {
                v1Str = (v1Str * 10) + v1.charAt(i) - '0';
                i++;
            }
            while (j < v2.length() && v2.charAt(j) != '.') {
                v2Str = (v2Str * 10) + v2.charAt(j) - '0';
                j++;
            }
            if (v1Str < v2Str) {
                System.out.println(-1);
                return;
            }
            if (v1Str > v2Str) {
                System.out.println(1);
                return;
            }
            i++;
            j++;
        }
        if (i < v1.length()) {
            System.out.println(1);
            return;
        }
        if (j < v2.length()) {
            System.out.println(-1);
            return;
        }
        System.out.println(0);
    }
}

// TODO
// LeastLargest
// Paranthesis
// staircase