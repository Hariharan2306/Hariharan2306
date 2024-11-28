package OldMaterial;
public class ReverseAsAsked {
    public static void main(String[] args) {
        String s="This is a test string only";
        String t="st";
//        op:This is a only string test
        String[] sArr=StringToArray(s);
        int k=0,i;
        boolean flag=true;
        for(i=0;sArr[i]!=null;i++){
            if(subString(sArr[i],t) && flag){
                flag=false;
                k=i;
            }
        }
        i--;
        int j=0;
        while (i>=k){
            if(j<k)
                System.out.print(sArr[j++]+" ");
            else
                System.out.print(sArr[i--]+" ");
        }
    }
    private static String[] StringToArray(String s){
        String[] sArr=new String[100];
        int i,k=0;
        String newString="";
        for(i=0;i<s.length();i++){
            boolean isAlpha=s.charAt(i)>='A'&&s.charAt(i)<='Z' || s.charAt(i)>='a'&&s.charAt(i)<='z';
            if(isAlpha)
                newString+=s.charAt(i);
            else {
                sArr[k++]=newString;
                newString="";
            }
        }
        sArr[k]=newString;

//        for (i=0;sArr[i]!=null;i++)
//            System.out.print(sArr[i]+" ");
        return sArr;
    }
    private static boolean subString(String s,String t){
//        s="test";
//        t="st";
        int i,j=0,k;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==t.charAt(j)){
                k=i;
                while (j<t.length() && i<s.length()){
                    if(s.charAt(i)==t.charAt(j)){
                        if(j==t.length()-1)
                            return true;
                        i++;
                        j++;
                    }
                    else {
                        i=k;
                        break;
                    }
                }
            }
        }
        return false;
    }
}
