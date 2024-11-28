public class NoOfWorkers {
    public static void main(String[] args) {
        int[] startTimes = { 1230, 1200, 1600 };
        int[] endTimes = { 0130, 0100, 1700 };
        // op-2
        int i, j, k = 1;

        for (i = 0; i < endTimes.length; i++) {
            if (startTimes[i] > endTimes[i])
                endTimes[i] = 1200 + Integer.parseInt(Integer.toOctalString(endTimes[i]));
        }
        for (i = 0; i < endTimes.length - 1; i++) {
            if (endTimes[i] > startTimes[i + 1])
                k++;
        }
        System.out.println(k);
        // for (i = 0; i < startTimes.length; i++)
        // System.out.println(startTimes[i] + " " + endTimes[i] + " ");
    }
}
//has many plotholes