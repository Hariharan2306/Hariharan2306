package OldMaterial;
import java.util.HashMap;
public class WordPattern {
//    Given a pattern and a string s, find if s follows the same pattern.
//    Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
//    Example 1:
//
//    Input: pattern = "abba", s = "dog cat cat dog"
//    Output: true
    public static void main(String[] args) {
        String p="abba";
        String s="dog dog dog dog";
        if(p.length()==0 || s.length()==0){
            System.out.println("pattern true");
            return;
        }

        HashMap<Character,String > map=new HashMap<>();
        int i,j;
        String a="";
        String[] arr=new String[p.length()];

        for(i=0,j=0;i<s.length() && j<p.length();i++){
            if(s.charAt(i)!=' ')
                a+=s.charAt(i);
            else {
                arr[j]=a;
                map.put(p.charAt(j++),a);
                a="";
            }
        }
        arr[j]=a;
        map.put(p.charAt(j),a);

        HashMap <String,Character>map2=new HashMap<>();
        for(i=0;i<arr.length;i++)
            map2.put(arr[i],p.charAt(i));

        if(p.length()!= arr.length){
            System.out.println("length mismatch false");
            return;
        }


        for(i=0;i<p.length();i++){
            if(!map.get(p.charAt(i)).equals(arr[i])){
                System.out.println("word pattern false");
//                boolean flag=false;
                return;
            }
            if(!map2.get(arr[i]).equals(p.charAt(i))){
                System.out.println("map2 failed");
                return;
            }
        }
        System.out.println("word pattern true");
    }
}