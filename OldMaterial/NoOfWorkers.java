package OldMaterial;
public class NoOfWorkers {
//  With the starting and ending time of work given find the minimum no of workers needed

//  Start time    end time
//  1230          0130
//  1200          0100
//  1600          1700
//    Output:2
    public static void main(String[] args) {
        int[] startTimes={1230,1200,1600};
        int[] endTimes={0130,0100,1700};
        int i;

        for(i=0;i<startTimes.length;i++){//to change to 24h format
            if(startTimes[i]>endTimes[i])
                endTimes[i] = 1200+Integer.parseInt(Integer.toOctalString(endTimes[i]));
        }

        int worker=1;
        for(i=0;i< startTimes.length-1;i++){//to count worker
            if(!(endTimes[i]<=startTimes[i+1]))//logic Start time of work should be same or equal to end time of previous work
                worker++;
        }
        System.out.println(worker);
    }
}