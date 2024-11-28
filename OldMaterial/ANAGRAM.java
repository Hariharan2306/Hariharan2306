package OldMaterial;
public class ANAGRAM {
    public static void main(String[] args) {
//        ANAGRAM
        String a="race";
        String b="care";

        if(a.length() != b.length()){
            System.out.println("not ANAGRAM");
            return;
        }

        int i=0;
        int[] freq=new int[26];

        do{
            freq[a.charAt(i)-'a']++;
            freq[b.charAt(i)-'a']--;
            i++;
        }while(i<a.length()-1);

        for(i=0;i< freq.length;i++) {
            if (freq[i] != 0){
                System.out.println("Not ANAGRAM");
                return;
            }
        }
        System.out.println("ANAGRAM");
    }
}
