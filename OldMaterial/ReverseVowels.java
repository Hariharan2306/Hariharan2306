package OldMaterial;
public class ReverseVowels {
//    Given a string s, reverse only all the vowels in the string and return it.
//    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both
//    lower and upper cases, more than once.
//    Example 1:
//
//    Input: s = "hello"
//    Output: "holle"
    public static void main(String[] args) {
        String a="leetcode";
//        op-holle
        int i,k=0;
        boolean isVowel;
        char[] vowels=new char[a.length()];
        char[] aArr=a.toCharArray();

        for(i=0;i<a.length();i++){
            isVowel=aArr[i]=='a' || aArr[i]=='e' || aArr[i]=='i' || aArr[i]=='o' || aArr[i]=='u' || aArr[i]=='A' ||
                    aArr[i]=='E' || aArr[i]=='I' || aArr[i]=='O' || aArr[i]=='U';
            if(isVowel)
                vowels[k++]=aArr[i];
        }
        k=0;
        for(i=a.length()-1;0<=i;i--){
            isVowel=aArr[i]=='a' || aArr[i]=='e' || aArr[i]=='i' || aArr[i]=='o' || aArr[i]=='u' || aArr[i]=='A' ||
                    aArr[i]=='E' || aArr[i]=='I' || aArr[i]=='O' || aArr[i]=='U';
            if(isVowel)
                aArr[i]=vowels[k++];
        }
        a=String.valueOf(aArr);
        System.out.println(a);
    }
}
