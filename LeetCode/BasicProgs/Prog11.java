package LeetCode.BasicProgs;

public class Prog11 {
    //gn Strings anagram or not
    public static boolean anagram(String s,String t) {
        int []arr=new int[26];
        if(s.length()!=t.length())// checking 2 Strings are of same length
            return false;

        s=s.replaceAll(" ","");//removing spaces
        System.out.println(s.toLowerCase());//changing upper case to lower case

        t=t.replaceAll(" ","");
        System.out.println(t.toLowerCase());

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<arr.length;i++)
            if(arr[i]!=0)
                return false;
        return true;
    }
    public static void main(String []args){
        String s="abc";
        String t="cba";
        if(anagram(s,t))
            System.out.println("is a anagram");
        else
            System.out.println("not a anagram ");
    }
}