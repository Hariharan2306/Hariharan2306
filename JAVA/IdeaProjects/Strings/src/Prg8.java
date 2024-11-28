import java.util.*;
class Prg8 {
    public static boolean isIsomorphic(String s, String t) {
        //declaring
        HashMap <Character,Character> ans_T=new HashMap <Character,Character>();
        HashMap <Character,Character> ans_S=new HashMap <Character,Character>();
        boolean result=true;
        int i;

        //checking length of  2 strings
        if(s.length()!=t.length())
            return false;

        //inserting values in 2 maps as of
        //ans_T s(i)-keys,,t(i)-values
        //ans_S t(i)-keys,,s(i)-values

        for(i=0;i<s.length();i++){
            ans_T.put(s.charAt(i),t.charAt(i));
            ans_S.put(t.charAt(i),s.charAt(i));
        }

        //check whether val and keys are present as placed
        //where t(i)-keys s(i)-val

        for(i=0;i<s.length();i++){
            if(ans_S.get(t.charAt(i))==s.charAt(i))
                result=true;
            else{
                result=false;
                return result;
                //break;
            }
        }

        //check whether val and keys are present as placed
        //where s(i)-keys t(i)-val

        for(i=0;i<s.length();i++){
            if(ans_T.get(s.charAt(i))==t.charAt(i))
                result=true;
            else{
                result=false;
                return result;
                //break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s="babc";
        String t="duty";//dudy
        if(isIsomorphic(s,t))
            System.out.println("both Strings are isomorphic ");
        else
            System.out.println("not isomorphic ");
    }
}