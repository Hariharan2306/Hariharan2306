package set1;

public class Xpattern {
    public static void main(String[] args) {
        int i,j;
        String s = "PROGRAM";
        for(i=0;i<s.length();i++){
            for(j=0;j<s.length();j++){
                if(i==j)
                    System.out.print(s.charAt(i));
                else if (j == s.length()-i-1)
                    System.out.print(s.charAt(s.length()-1-i));
                else    
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
// P         M
//  R      A
//    O  R
//      G
//   O    R
//  R       A
// P          M 