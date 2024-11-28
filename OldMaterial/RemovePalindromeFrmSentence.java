package OldMaterial;
public class RemovePalindromeFrmSentence{
    public static void main(String[] args) {
        String ip="He did a good deed";
        ip=ip.toLowerCase();

        int i;
        String s="",op="";
        for(i=0;i<ip.length();i++){
            if(ip.charAt(i) == ' ') {
                if(! isPalindrome(s))
                    op+=s+" ";
                s="";
                continue;
            }
            s+=ip.charAt(i);
        }

        if(! isPalindrome(s))
            op+=s;

        System.out.println(op);
    }
    static boolean isPalindrome(String s){
        int i;
        String p="";
        for(i=s.length()-1;i>=0;i--)
            p+=s.charAt(i);

        return p.equals(s);
    }
}
//public class RemovePalindromeFrmSentence {
//    public static void main(String[] args) {
////        String ip="He did a good deed";
//        //op-"He good"
//        String ip="Malayalam is my mother tongue";
////        op-"is my mother tongue"
//        String[] ipArr=new String[10];
//        String word="";
//        int i,k=0;
//
//        for(i=0;i<ip.length();i++){//to make the sentence to a String array
//            if(ip.charAt(i)==' '){
//                ipArr[k++]=word;
//                word="";
//                i++;
//            }word+=ip.charAt(i);
//        }
//        ipArr[k]=word;
//
//        for (k=0;ipArr[k]!=null;k++)//to show op
//            if(!palindrome(ipArr[k]))
//                System.out.print(ipArr[k]+" ");
//    }
//    public static boolean palindrome(String w){//to check whether boolean or not
//        w=w.toLowerCase();
//        String s="";
//        for(int n=w.length()-1;n>=0;n--){
//            s+=w.charAt(n);
//        }
//
//        return s.equals(w);
//    }
//}
