package OldMaterial;
public class New {
    public static void main(String[] args) {
        String str="a(b(c){2}){2}d";
        String  count="";
        String ch="";
        for(int i=0;i<str.length();i++){
            boolean isALph=str.charAt(i)>='a' && str.charAt(i)<='z';
            boolean isNum=str.charAt(i)>='0' && str.charAt(i)<='9';
            if(isALph)
                ch+=str.charAt(i);
        }
    }
}
