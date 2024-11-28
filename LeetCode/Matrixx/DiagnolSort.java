package LeetCode.Matrixx;

import java.util.ArrayList;
import java.util.Collections;

// 3, 3, 1, 1
// 2, 2, 1, 2
// 1, 1, 1, 2

public class DiagnolSort {
    public static void main(String[] args) {
        int[][] a = { { 3, 3, 1, 1 }, { 2, 2, 1, 2 }, { 1, 1, 1, 2 } };
        int i = a.length - 2, j = 0, m, n, l;

        if (a.length == 1) {
            System.out.println("print a here");
            return;
        }
        while (i > 0 || j <= a[i].length - 1) {
            m = i;
            n = j;
            ArrayList<Integer> list = new ArrayList<>();
            while (m < a.length && n < a[i].length)
                list.add(a[m++][n++]);
            Collections.sort(list);
            m = i;
            n = j;
            for (l = 0; l < list.size(); l++)
                a[m++][n++] = list.get(l);
            if (i > 0)
                i--;
            else
                j++;
        }
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++)
                System.out.print(a[i][j]);
            System.out.println();
        }
    }
}
