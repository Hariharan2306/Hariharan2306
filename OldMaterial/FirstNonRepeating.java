package OldMaterial;
public class FirstNonRepeating {
    //to find the first non repeating characters
    public static void main(String[] args) {//done
        String s="leetcode";
        int i,j;
        for(i=0;i<s.length();i++){
            for(j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && i!=j)
                    break;
                else if (j==s.length()-1) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}