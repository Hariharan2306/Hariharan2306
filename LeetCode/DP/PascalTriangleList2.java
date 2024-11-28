package LeetCode.DP;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleList2 {
    // Example 1:
    // Input: numRows = 5
    // Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    public static void main(String[] args) {
        int n = 5, i, j, c, k;
        List<List<Integer>> op = new ArrayList<List<Integer>>();

        for (i = 1; i <= n; i++) {
            c = 1;
            k = 1;
            List<Integer> el = new ArrayList<>();
            for (j = 1; j <= i; j++) {
                el.add(c);
                c = c * (i - k) / k;
                k++;
            }
            op.add(el);
        }
        System.out.println(op);
    }
}
