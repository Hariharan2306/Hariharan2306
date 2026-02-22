package ZPatterns;

public class LongstPalin {
    public static void main(String[] args) {
        String s = "ccd";
        int[] fre = new int[32];

        for (char c : s.toCharArray())
            fre[c - 'a']++;
        boolean hasOdd = false;
        int length = 0;
        for (int i : fre) {
            length += (i / 2) * 2;
            if (i % 2 == 1)
                hasOdd = true;
        }
        if (hasOdd)
            length += 1;
        System.out.println(length);
    }
}
