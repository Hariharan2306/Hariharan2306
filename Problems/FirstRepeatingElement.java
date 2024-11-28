
import java.util.HashMap;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        char[] a = { 'd', 'c', 'a', 'b' };
        HashMap<Integer, Character> map = new HashMap<>();
        int i = 0;
        while (i < a.length) {
            if (map.containsValue(a[i])) {
                System.out.println(i);
                return;
            }
            map.put(i, a[i]);
            i++;
        }
        System.out.println(-1);
    }
}
