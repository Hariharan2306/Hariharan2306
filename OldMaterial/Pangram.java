package OldMaterial;
public class Pangram {
//    A pangram is a sentence where every letter of the English alphabet appears at least once.
//    Given a string sentence containing only lowercase English letters,
//    return true if sentence is a pangram, or false otherwise.
//    Example 1:

//    Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//    Output: true
//    Explanation: sentence contains at least one of every letter of the English alphabet.
    public static void main(String[] args) {
        int i=0;
        int[] alpha=new int[26];
        String sentence="thequickbrownfoxjumpsoverthelazydog";

        while (i<sentence.length()){
            if(! (sentence.charAt(i)<='z' && sentence.charAt(i)>='a')){
                System.out.println(false);
                return;
            }
            alpha[sentence.charAt(i)-'a']++;
            i++;
        }
        i=0;
        while (i< alpha.length){
            if(alpha[i]==0){
                System.out.println(false);
                return;
            }
            i++;
        }
        System.out.println(true);
    }
}
