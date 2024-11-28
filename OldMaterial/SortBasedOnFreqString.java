package OldMaterial;

public class SortBasedOnFreqString {
//Given a string s, sort it in decreasing order based on the frequency of the characters.
// The frequency of a character is the number of times it appears in the string.
//Return the sorted string. If there are multiple answers, return any of them.
//Example 1:

//Input: s = "tree"
//Output: "eert"
//Explanation: 'e' appears twice while 'r' and 't' both appear once.
//So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
    public static void main(String[] args) {
        //not yet completed
        String s="loveleetcode";
//        op eert
        char[] s1=s.toCharArray();
        int i,j,temp;
        char t;
        int[] freq=new int[s.length()];
        for(i=0;i<s.length();i++){
            freq[i]++;
            for(j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) &&i!=j)
                    freq[j]++;
            }
        }
//        for(i=0;i< freq.length;i++)
//            System.out.print(s.charAt(i)+" ");
//        System.out.println();
//        for(i=0;i< freq.length;i++)
//            System.out.print(freq[i] + " ");

        for(i=0;i< freq.length-1;i++){
            for(j=0;j< freq.length-1-i;j++){
                if(freq[j]<freq[j+1]) {
                    temp = freq[j + 1];t=s1[j+1];
                    freq[j+1]=freq[j];s1[j+1]=s1[j];
                    freq[j]=temp;s1[j]=t;
                }
                else if(freq[j]==freq[j+1]){
                    if(s1[j]<s1[j+1]){
                        t=s1[j+1];
                        s1[j+1]=s1[j];
                        s1[j]=t;
                    }
                }
            }
        }
        s= String.valueOf(s1);
//        System.out.println();
        System.out.println(s);
    }
}
