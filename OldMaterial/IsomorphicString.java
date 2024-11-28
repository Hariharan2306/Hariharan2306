package OldMaterial;
import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
//        Input: s = "egg", t = "add"
//        Output: true
        String a="babc",b="duty";
        if(a.length() != b.length()){
            System.out.println("false");
            return;
        }

        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        int i;

        for(i=0;i<a.length();i++){
            map1.put(a.charAt(i),b.charAt(i));
            map2.put(b.charAt(i),a.charAt(i));
        }
        for(i=0;i<a.length();i++){
            if(map1.get(a.charAt(i)) != b.charAt(i) || map2.get(b.charAt(i)) != a.charAt(i)){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}