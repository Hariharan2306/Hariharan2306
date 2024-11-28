import java.util.Arrays;
class Prg4 {
    public static boolean buddyStrings(String s, String goal) {
        // gn two string by swapping only one element in a ny string other string is formed
        // this algo is not time efficient
        char []s1=s.toCharArray();
        char []goal1=goal.toCharArray();
        char temp;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                s1=s.toCharArray();
                temp=s1[i];
                s1[i]=s1[j];
                s1[j]=temp;
              //  System.out.println(s1);
                if(Arrays.equals(s1, goal1) && i!=j)// method to check two arrays or equal or not
                    return true;
            }
            System.out.println("i "+i);
            ////System.out.println(s1);
        }
        return false;
    }
    public static void main(String[] args) {
        String s="aaaaaaabc",goal="aaaaaaacb";
        if(buddyStrings(s,goal))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
