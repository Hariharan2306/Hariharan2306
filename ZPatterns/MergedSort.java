package ZPatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergedSort {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        System.out.println(Arrays.deepToString(merge(intervals)));
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();

        int start = intervals[0][0], end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (end >= intervals[i][0]) {
                end = Math.max(intervals[i][1], end);
            } else {
                merged.add(new int[] { start, end });
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        merged.add(new int[] { start, end });
        return merged.toArray(new int[merged.size()][]);
    }
}
