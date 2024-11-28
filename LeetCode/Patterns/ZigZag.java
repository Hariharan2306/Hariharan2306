package LeetCode.Patterns;

public class ZigZag {
    public static void main(String[] args) {
        String a="hari";
        int i,j;
        for(i=0;i<a.length();i++){
            for(j=0;j<a.length();j++){
                if(i==j )
                    System.out.print(a.charAt(i));
                else if( j==a.length()-1-i)
                    System.out.print(a.charAt(a.length()-1-i));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
