import java.util.*;
//public class Dummy {
//    public static void main(String[] args) {
//        String s="dog cat cat dog",wordPattern="abba",a="";
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==' ')
//                a="";
//            else{
//                a+=s.charAt(i);
//                if((i+1)<s.length() && s.charAt(i+1)==' ')
//                    System.out.println(a);
//            }
//        }
//    }
//}
class Dummy {
    public static boolean wordPattern(String pattern, String s) {
        HashMap <Character, String> ans=new HashMap<>();//here separating each word from the given String and then putting it into hashmap
        String a="";
        int i,k=0;
        boolean result=true;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
                a="";
            else{
                a+=s.charAt(i);
                if(i==(s.length()-1) || s.charAt(i+1)==' '){
                    ans.put(pattern.charAt(k),a);
                    k++;
                }
            }
        }

        System.out.println(ans);
        k=0;
        a="";
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
                a="";
            else{
                a+=s.charAt(i);
                if(i==(s.length()-1) || s.charAt(i+1)==' '){
                    System.out.println(pattern.charAt(k));
                    System.out.println(ans.get(pattern.charAt(k)));
                    System.out.println(a);
                    if(ans.get(pattern.charAt(k)).equals(a)){
                        result=true;}
                    else
                        return false;
                    k++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s="dog cat cat fish", pattern="abba";
        if(wordPattern(pattern,s))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
