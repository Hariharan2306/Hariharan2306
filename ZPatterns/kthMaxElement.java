package ZPatterns;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthMaxElement {
    public static void main(String[] args) {
        int[] a = { 2, 4, 5, 6, 7, 9, 10, 13 };
        // int k = 2;
        // int max = 0;
        // for (int j = 0; j < k; j++) {
        // max = 0;
        // for (int i = 0; i < a.length; i++) {
        // if (a[i] > a[max])
        // max = i;
        // }
        // if (j != k - 1)
        // a[max] = -1;
        // }
        // System.out.println(a[max]);
        kthmax(a);
    }

    static void kthmax(int[] a) {
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        // PriorityQueue<Integer> maxQueue = new
        // PriorityQueue<>(Collections.reverseOrder());
        int k = 3;
        for (int el : a) {
            minQueue.offer(el);
            if (minQueue.size() > k)
                minQueue.poll();
        }
        System.out.println(minQueue.peek());
    }
}
