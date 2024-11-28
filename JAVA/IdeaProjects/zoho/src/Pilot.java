import java.util.Scanner;
public class Pilot {
    public static void main(String[] args) {
        Passenger obj=new Passenger();//invoking method in passenger class
        obj.travelling();
        String planeName1="AIRBUS A380";//arguments to
        int planeName2=16;//given
        Scanner sc=new Scanner(System.in);
        boolean doyouwantcommercial=sc.nextBoolean();
        //method overloading
        Pilot obj1=new Pilot();
        if(doyouwantcommercial)
            obj1.plane(planeName1);//commercial
        else
            obj1.plane(planeName2);//fighter
         }
    public void plane(int planeName2){
        System.out.println("name of the plane is "+planeName2);
        boolean fightable=true;
        boolean commercial=false;
        int seats=75;
        System.out.println("does the plane fight "+fightable);
        System.out.println("is the plan commercial "+commercial);
        System.out.println("number of seats available "+seats);

    }
    public void plane(String planeName1)
    {
        System.out.println("name of the plane is "+planeName1);
        boolean fightable1=false;
        boolean commercial1=true;
        int seats1=1;
        System.out.println("deoes the plan fight "+fightable1);
        System.out.println("is the plan commmercial "+commercial1);
        System.out.println("number of seats available "+seats1);
    }

}