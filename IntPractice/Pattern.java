package IntPractice;
public class Pattern {
    public static void main(String[] args) {
        int i,j;
        // pattern
        String s = "1234567";
        for(i=0;i<s.length();i++){
            for(j=0;j<s.length();j++){
                if(j == i || j == s.length()-1-i || j == s.length()/2)
                    System.out.print(s.charAt(i)+" ");
                else if(i == s.length()/2 )
                    System.out.print(s.charAt(j)+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
