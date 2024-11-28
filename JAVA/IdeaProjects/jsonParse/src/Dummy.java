public class Dummy {
    public static void main(String[] args) {
        String s="eetcode";
        int i,j;
        for(i=0;i<s.length();i++){
            for(j=0;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j) && i != j)
                    break;
                else if(j == s.length()-1){
                    System.out.println(s.charAt(i));
                    return;
                }
            }
        }
        System.out.println(-1);// if no repeat
    }
}
