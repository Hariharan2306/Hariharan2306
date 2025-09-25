import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        // Input: words = ["leet","code"], x = "e"
        String[] words = { "leet", "code" };
        char x = 'e';
        List<Integer> counts = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1)
                counts.add(i);
        }
        System.out.println(counts);
    }
}
// https://leetcode.com/discuss/post/5921082/commerceiq-sde-1-accepted-by-anonymous_u-lpkj/
// https://leetcode.com/discuss/post/5650392/commerceiq-sde1-interview-experience-by-8jdlf/
// https://leetcode.com/discuss/post/2192132/commerceiq-sde-2-bangalore-june-2022-off-whsn/