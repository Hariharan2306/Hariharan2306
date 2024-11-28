package OldMaterial;
public class CountFreqAndSortString {
//    Given an array of strings words and an integer k, return the k most frequent strings.
//    Return the answer sorted by the frequency from highest to lowest. Sort the words with the same
//    frequency by their lexicographical order.
//    Example 1:

//    Input: words = ["i","love","leetcode","i","love","coding"], k = 2
//    Output: ["i","love"]
//    Explanation: "i" and "love" are the two most frequent words.
//    Note that "i" comes before "love" due to a lower alphabetical order.
    public static void main(String[] args) {        //done
        String[] words={"i","love","leetcode","i","love","coding"};
        int k=2;
        int i,j;
        int[] freq=new int[words.length];
        for(i=0;i< words.length;i++){
                freq[i]++;
            for(j=i+1;j< words.length;j++){
                if(words[i].equals(words[j]) && !words[i].equals("1")){
                   freq[i]++;
                   words[j]="1";
                }
            }
        }
//        i=0;
//        while (i< freq.length){
//            if(!words[i].equals("1"))
//                System.out.println(words[i]+"-"+freq[i]);
//            i++;
//        }
//        System.out.println();

        int big;
        for(j=0;j<k;j++){
            big=0;
            for(i=0;i<freq.length;i++){
                if(freq[i]>freq[big])
                    big=i;
                else if(freq[i]==freq[big])
                    big=smolAlpha(words[i],words[big],i,big);
            }
            System.out.println(words[big]+"-"+freq[big]);
            freq[big]=0;
        }
    }
    private static int smolAlpha(String str1,String str2,int str1Idx,int str2Idx){

        if(str1.length()<str2.length())
            return str1Idx;
        else if (str2.length()<str1.length())
            return str2Idx;

        int i;
        for(i=0;i<str1.length();i++){
            if(str1.charAt(i)<str2.charAt(i))
                return str1Idx;
            else if (str1.charAt(i) > str2.charAt(i))
                return str2Idx;
        }
        return str1Idx;
    }
}