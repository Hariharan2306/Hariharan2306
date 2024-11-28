package JAVA.IdeaProjects.Taxi.src;

public class dummy {
    public static void main(String[] args) {
        char[] loc = {'A', 'C', 'D', 'E', 'C','F'};
        int[] earned={ 20, 12,  17,  15,  11, 15};
        boolean[] avail={false,false,false,false,false,false};
        char a='C';
        boolean flag=false;

        int i,idx=0,min=Math.abs('F'-'A');
        for(i=0;i<loc.length;i++){
            int diff=Math.abs(loc[i]-a);
            if(diff < min && avail[i]){
                flag=true;
                idx=i;
                min=diff;
            }
            if(diff == min && avail[i]){
                flag=true;
                if(earned[i] < earned[idx])
                    idx=i;
            }
        }
        if(! flag) {
            System.out.println("Bookings Failed");
            return;
        }
        System.out.println(loc[idx] +" "+idx);
    }
}
//line 37
//            if(c.getFreeTime() == pickupTime || c.getFreeTime() == 0){
//                anythingAvailable=true;
//                eligible=c;
//                if(c.getCurrentLocation() == 0 || Math.abs(c.getCurrentLocation() - pickupPoint) < curMin){
//                    curMin=Math.abs(c.getCurrentLocation());
//                    eligible=c;
//                }
//                if(Math.abs(c.getCurrentLocation() - pickupPoint) == curMin){
//                    if(c.getEarned() < eligible.getEarned())
//                        eligible=c;
//                }
//            }