public class MissAndRepeat {
    public static void main(String[] args) {
        int[] a = { 2, 2 };
        int i, j;
        int repeat = -1, miss = -1;
        boolean flag = false;
        int[] op = new int[a.length];

        // for (i = 0; i < a.length; i++) {
        // for (j = 0; j < a.length; j++) {
        // if (a[j] == i + 1) {
        // if (flag) {
        // repeat = a[j];
        // continue;
        // }
        // flag = true;
        // } else if (j == a.length - 1)
        // miss = i + 1;
        // }
        // flag = false;
        // }
        // System.out.println("repeat " + repeat + " miss " + miss);

        for (i = 0; i < a.length; i++) {
            if (op[a[i] - 1] != 0) {
                System.out.println("repeat " + a[i]);
                break;
            }
            op[a[i] - 1] = 1;
        }
        for (i = 0; i < a.length; i++) {
            if (op[i] == 0) {
                System.out.println("miss " + (i + 1));
                break;
            }
        }
    }
}