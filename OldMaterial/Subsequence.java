package OldMaterial;
public class Subsequence {
    public static void main(String[] args) {
//        Input: s = "abc", t = "ahbgdc"
//        Output: true
        String s = "abc", t = "ahbgdc";
        int i,j,idx=-1;
        boolean flag;

        for(i=0;i<s.length();i++){
            flag=false;
            for(j=0;j<t.length();j++){
                if(s.charAt(i) == t.charAt(j) && j > idx){
                    idx=j;
                    flag=true;
                    break;
                }
            }
            if(! flag){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
