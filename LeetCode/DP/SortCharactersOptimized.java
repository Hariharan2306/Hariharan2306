package LeetCode.DP;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersOptimized {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int i;
        HashMap<Character, Integer> map = new HashMap<>();

        for (i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), 1);
            else
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        String ans = "";
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> (map.get(b) - map.get(a)));
        pq.addAll(map.keySet());
        while (!pq.isEmpty()) {
            char ch = pq.poll();
            for (i = 0; i < map.get(ch); i++)
                ans += ch + " ";
        }
        System.out.println(ans);
    }
}
