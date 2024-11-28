package OldMaterial;
public class StarSubstring {
//    Star only done
    public static void main(String[] args) {
        String a="zoho";
        String b="*o*o";
        int i;
        String ref="";
        boolean hasNoStar=true,op=true;

        for(i=0;i<b.length();i++) {
            if (b.charAt(i) == '*') {//if has star in gn str
                if(!ref.equals("")){
                    op=hasStar(a,ref);
//                    System.out.println(op+" op "+a+" a "+ref+" ref\n");
                }
                hasNoStar=false;
                ref="";
                continue;
            }
            ref+=b.charAt(i);
        }
        if(hasNoStar){//if no star
//            System.out.println("hello");
            System.out.println(noStar(a,b));
            return;
        }
        if(op){//output must be true for substring before * and after *
            if(!ref.equals(""))
                op=hasStar(a,ref);
//            System.out.println(op+" op "+a+" a "+ref+" ref");
        }
        System.out.println(op);

    }
    private static boolean noStar(String a,String b){
        int i;

        if(a.length()!=b.length())
            return false;

        for(i=0;i<b.length();i++)
            if(b.charAt(i)!=a.charAt(i))
                return false;

        return true;
    }
    private static boolean hasStar(String str,String sub){
//        str="test";
//        sub="tes";
//        System.out.println(sub);
        int i=0,j,k;

//        for(i=0;i<sub.length();i++){
            for(j=0;j<str.length();j++){
                if(sub.charAt(i)==str.charAt(j)){
//                    k=i;
                    while(i<sub.length() && j<str.length()){//str="abcde";//sub="ce";
                        if(sub.charAt(i)!=str.charAt(j))
                            break;
                        if(i==sub.length()-1)
                            return true;
                        i++;
                        j++;
                    }
//                    i=k;
                }
                i=0;
//                else if (i==sub.length()-1 && sub.length()!=1)
//                     return false;
            }
//        }
        return false;
    }
}
