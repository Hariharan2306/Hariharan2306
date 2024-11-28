package Problems;

public class Anagram {
    public static void main(String[] args) {
        String a = "race";
        String b = "care";

        if (a.length() != b.length()) {
            System.out.println("Not Anagram ");
            return;
        }
        int i = 0;
        int[] arr = new int[26];
        while (i < a.length()) {
            arr[a.charAt(i) - 'a']++;
            arr[b.charAt(i) - 'a']--;
            i++;
        }
        i = 0;
        while (i < arr.length) {
            if (arr[i] != 0) {
                System.out.println("Not Anagram ");
                return;
            }
            i++;
        }
        System.out.println("Anagram");
    }
}