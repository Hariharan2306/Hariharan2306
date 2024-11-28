package LeetCode;

public class ScoreOfString {
    public static void main(String[] args) {
        String s = "hello";
        int i, j = 0, count;

        for (i = 0; i < s.length() - 1; i++) {
            count = s.charAt(i) - s.charAt(i + 1);
            j += count >= 0 ? count : -(count);
        }
        System.out.println(j);

    }
}
