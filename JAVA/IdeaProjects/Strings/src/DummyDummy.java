import java.util.HashMap;
public class DummyDummy {
    public static boolean wordPattern(String pattern,String s){
        HashMap <Character,String> ans=new HashMap<>();
        String a="";
        boolean result=true;
        int i,k=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
                a="";
            else {
                a+=s.charAt(i);
                if(i==(s.length()-1) || s.charAt(i+1)==' ') {
                    if (ans.containsKey(pattern.charAt(k)) && ans.containsValue(a))
                        continue;
                    else if (ans.containsKey(pattern.charAt(k)) || ans.containsValue(a))
                        return false;
                    else{
                        ans.put(pattern.charAt(k),a);
                        k++;}
                }
            }
        }
    return result;
    }
    public static void main(String[] args) {
        String s="dog cat cat dog",pattern="abba";
        if(wordPattern(pattern,s))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
