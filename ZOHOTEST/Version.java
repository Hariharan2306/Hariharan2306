import java.util.Scanner;

public class Version {
    public static void main(String[] args) {
        // String v1 = "1.0";
        // String v2 = "1.0.0";
        String v1 = getInput();
        String v2 = getInput();
        int i =0 ,j = 0;
        int v1Num = 0, v2Num = 0;

        while(i<v1.length() || j < v2.length()){

            while (i<v1.length() && v1.charAt(i) != '.') {
                v1Num+= (10*v1Num) + v1.charAt(i) - '0';
                i++;
            }

            while (j<v2.length() && v2.charAt(j) != '.') {
                v2Num+= (10*v2Num) + v2.charAt(j) - '0';
                j++;
            }

            // System.out.println( v1Num+ " "+ v2Num);
            if(v1Num < v2Num){
                System.out.println(-1);
                return;
            }
            if(v2Num < v1Num){
                System.out.println(1);
                return;
            }
            i++;
            j++;
            v1Num = 0;
            v2Num = 0;
        }
        if(i<v1.length()){
            System.out.println(1);
            return;
        }
        if(i<v1.length()){
            System.out.println(-1);
            return;
        }
        System.out.println(0);
    }

    static String getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String s = sc.next();
        return s;
    }
}
