package OldMaterial;
public class ReverseVowels2 {
    //to reverse vowels alone in a String
    //to pointer approach
    //same ms as another approach but extra memory
    public static void main(String[] args) {
        String a= "leetcode";
        char[] aArr=a.toCharArray();
        int first =0, last = aArr.length-1;
        char temp;
        boolean isFirstVowel;
        boolean isLastVowel;
        while (first < last){
            isFirstVowel=aArr[first]=='a' || aArr[first]=='e' || aArr[first]=='i' || aArr[first]=='o'
                          || aArr[first]=='u' || aArr[first]=='A' || aArr[first]=='E'
                          || aArr[first]=='I' || aArr[first]=='O' || aArr[first]=='U';
            isLastVowel=aArr[last]=='a' || aArr[last]== 'e' || aArr[last]=='i' || aArr[last]=='o'
                        || aArr[last]=='u' || aArr[last]=='A' || aArr[last]=='E'
                        || aArr[last]=='I' || aArr[last]=='O' || aArr[last]=='U';

            if(isFirstVowel && isLastVowel){
                temp=aArr[first];
                aArr[first]=aArr[last];
                aArr[last]=temp;
                first++;
                last--;
            }
            else if(isFirstVowel && ! isLastVowel)
                last--;
            else if (! isFirstVowel && isLastVowel)
                first++;
            else if (! isFirstVowel && ! isLastVowel) {
                first++;
                last--;
            }
        }
        a=String.valueOf(aArr);
        System.out.println(a);
    }
}