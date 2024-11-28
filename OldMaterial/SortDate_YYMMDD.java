package OldMaterial;
//import java.util.Scanner;

public class SortDate_YYMMDD {
//    Input: dates[] = {“01 Mar 2015”, “11 Apr 1996”, “22 Oct 2007”}
//    Output:
//            11 Apr 1996
//            22 Oct 2007
//            01 Mar 2015
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        String[] dates ={"2015 Mar 01", "1996 Apr 11", "2007 Sep 22"};
        int i=0,j=0,k=0;
        String tempVar="",month="";
        int[] datesNum=new int[dates.length];

        for(i=0;i<dates.length;i++) {//to traverse each String in array
            tempVar="";
            for(j=0;j<dates[i].length();j++){//to traverse each letter in String
                if(!(dates[i].charAt(j)==' '))//simply keep adding if its not space
                    tempVar+=dates[i].charAt(j);
                else{                          //if its space add separately and parse to method
                    month="";
                    k=0;
                    j++;
                    while (k<3 && dates[i].charAt(j)>='A' && dates[i].charAt(j)<='Z' || dates[i].charAt(j)>='a' && dates[i].charAt(j)<='z'){//to traverse the months
                        k++;//to make sure months are only of 3 char
                        month+=dates[i].charAt(j);
                        j++;
                    }
//                    System.out.println(k+"k");
                    month=toCheckMonth(month);//passing
//                    System.out.println(month+"month");
                    tempVar+=month;
//                    System.out.println(tempVar+"tempVar");
                }
            }
                datesNum[i]= Integer.parseInt(tempVar);//final date in String
        }

        for(i=0;i<dates.length;i++)
            System.out.println(dates[i]);

        System.out.println();

        System.out.println("Sorted");
        System.out.println();

        //bubble
        int temp;
        String tempStr="";
        for(i=0;i< datesNum.length-1;i++){
            for(j=0;j< datesNum.length-1-i;j++){
                if(datesNum[j]>=datesNum[j+1]){
                    temp=datesNum[j];tempStr=dates[j];
                    datesNum[j]=datesNum[j+1];dates[j]=dates[j+1];
                    datesNum[j+1]=temp;dates[j+1]=tempStr;
                }
            }
        }

        for(i=0;i<datesNum.length;i++)
            System.out.println(dates[i]);
    }
    public static String toCheckMonth(String month){
//        System.out.println(month);
        String[] monthsArr ={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int i;
        for(i=0; i< monthsArr.length; i++){
            if(month.equals(monthsArr[i])) {
                if (i <= 8)
                    month ="0"+ (i + 1);
                else
                    month = String.valueOf(i+1);
            }
        }
        return month;
    }
}