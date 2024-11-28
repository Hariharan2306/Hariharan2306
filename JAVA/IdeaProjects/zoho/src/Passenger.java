import java.util.Scanner;
public class Passenger extends Airhostes{//inheriting
    void travelling(){
        Scanner sc=new Scanner(System.in);
        Passenger obj2=new Passenger();//invoking objects in passenger class
        obj2.durationTravel=6;
        obj2.work=false;
        obj2.inTime= "8AM";
        int ticketnos[]={23,41,75,56,79};
        int yourticketno=sc.nextInt();
        for(int i=0;i<5;i++)
        {
            if(yourticketno==ticketnos[i]){
                System.out.println("welcome passenger ");
            }
        }
        System.out.println("in time of the passenger is "+inTime);
        System.out.println("the duration of travel for passenger is "+durationTravel);
        System.out.println("does the passenger have to work "+work);
    }
}
