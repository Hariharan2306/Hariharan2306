package LeetCode;


import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String s="dog cat cat dog",pattern="acba";
        // true
        String[] a = s.split(" ") ;
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(map.get(pattern.charAt(i)) == null && !map.containsValue(a[i]))
                map.put(pattern.charAt(i), a[i]);
            else if(map.get(pattern.charAt(i)) != null && map.get(pattern.charAt(i)).equals( a[i]))
                continue;
            else{
                System.out.println(false);
                return;
            }
        }
        // System.out.println(map.get('a'));
        System.out.println(true);
    }    
}
