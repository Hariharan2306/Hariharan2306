import java.util.HashMap;
public class IsomorphicString {
    public static void main(String[] args) {
        //isomorphic Strings
        int i;
        String s="badc", t="baba", str="";//abcddd  kfghgh
        HashMap <Character,Character> ans=new HashMap<>();
        HashMap <Character,Character> ans1=new HashMap<>();

        if(s.length() != t.length())
            System.out.println("false length");

        for(i=0;i<s.length();i++){
            ans.put(s.charAt(i),t.charAt(i));
            ans1.put(t.charAt(i),s.charAt(i));}

        if(ans.size() != ans1.size())
            System.out.println("false not hash size");

        for(i=0;i<s.length();i++)
            str+=ans.get(s.charAt(i));

        System.out.println(str+" "+t);
        if(str.equals(t))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
