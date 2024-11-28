public class Dummy{
    public static void main(String[] args) {
        int tickets = 6;
        int [][] seats = new int[5][5];
        boolean availability = true;
        boolean tAvailability = availability;
        {
            seats [0][0] = 1;    //here consider those with value 0 is booked seat
            seats [1][4] = 1;
            seats [2][2] = 1;
            seats [3][1] = 1;
            seats [3][2] = 1;
            seats [3][0] = 1;
            seats [3][3] = 1;
            seats [4][3] = 1;   //manually un-filling seats
        }
        int i,j,k=0;
        boolean flag = true;
        for(i = 0;i < seats.length;i++){
            for(j = 0;j < seats[0].length;j++){
               if(seats[i][j] == 1)
                   k++;
               if(k == tickets+1) {
                   flag =false;
                   System.out.println("hi");
                   break;
               }
            }
            if(! flag)
                break;
        }
        System.out.println(k+" k");
        if(k < tickets){
            System.out.println("not enough ");
            return;
        }else if(k != tickets+1)
            tAvailability =false;       //one extra ticket available

        k=0;
        String[] seatNo = new String[tickets];
        for(i=0;i< seats.length;i++){
            for(j=0;j<seats[0].length && k< seatNo.length;j++){
                if(seats[i][j] == 1) {
                    char temp = (char) (i+'A');
                    seatNo[k++] = temp +""+ j;
                }
            }
        }
        for(i=0;i< seatNo.length;i++)
            System.out.print(seatNo[i]+" ");
        System.out.println("\n Booking completed");     //only after bookings completed availability must be changed
        availability = tAvailability;
        System.out.println(availability);
    }
}