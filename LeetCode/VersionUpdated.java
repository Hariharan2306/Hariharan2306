package LeetCode;


public class VersionUpdated {
    public static void main(String[] args) {
        int i = 0, j = 0, a = 0, b = 0;
        String v1 = "1.0";
        String v2 = "1.0.0";
        while (i < v1.length() || j < v2.length()) {
            while (i < v1.length() && v1.charAt(i) != '.')
                a = a * 10 + (v1.charAt(i++) - '0');
            while (j < v2.length() && v2.charAt(j) != '.')
                b = b * 10 + (v2.charAt(j++) - '0');

            if (a < b){
                System.out.println("Up");
                return;
            }
            else if (a > b){
                System.out.println("down");
                return;
            }
            a = b = 0;
            i++;
            j++;
        }
        if (i < v1.length()){
            System.out.println("Down");
            return;
        }
        if (j < v2.length()){
            System.out.println("Up");
            return;
        }
        System.out.println("equal");
    }
}
