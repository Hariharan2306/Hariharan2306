import java.util.Scanner;
public class Pattern_4 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Long time = 678972134L;
        //Long time=sc.nextLong();
        System.out.println("press 1 for GST ");
        System.out.println("press 2 for pacific mean time ");
        System.out.println("press 3 for IST ");
        int choice=sc.nextInt();
        switch(choice){
            case 1: timeDate(time);//GST
            break;
            case 2: timeDate(time+60000*60);//1hr +
            break;
            case 3: timeDate(time+60000*30*3);//1.5hr+
            break;
        }
    }
    public static void timeDate(Long time){
        Long temp;
        int mnths[]={31,28,31,30,31,30,31,31,30,31,30,31};
        long m1 = time /(60000*60*24*30);//assumin mnths have 30 days
        //System.out.println(m1 + "no of months");
        long rest=time%(60000*60*24*30);//m
        //System.out.println("rest than months");
        temp=rest;
        long w1=time/(60000*60*24*7);//weeks in gn
        //System.out.println(w1+"no of weeks");
        rest=time%(60000*60*24*7);//rest than week
        //System.out.println(rest+"rest than week");
        temp=rest;
        long d1=temp/(60000*60*24);//d
        //System.out.println(d1+"rest no of days");
        rest=temp%(60000*60*24);//d
        //System.out.println(rest+"rest than days");
        temp=rest;
        long h1=temp/(60000*60);//h
        //System.out.println(h1+"rest no of hrs");
        rest=temp%(60000*60);//h
        //System.out.println(rest+"rest than hrs");
        temp=rest;
        long min1=temp/60000;//m
        //System.out.println(min1+"rest no of mins");
        int gnYr=1970;
        //long m1=1;
        //int i=0;
        //while(i<12&&d1>=28)

        m1++;
        System.out.print(d1+7*w1+" "+m1+" "+"1970"+" "+h1+" "+min1);
    }
}
