package LeetCode;

public class SortDates{
    // summary split each string and convert to numbers, compare nums, then months
    public static void main(String[] args) {
        int i,j;
        String[] dates ={"2015 Mar 01", "1996 Apr 11", "2007 Sep 22"};

        for(i=0;i<dates.length-1;i++){
            for(j=0;j<dates.length-i-1;j++){
                if( olderDate( dates[j+1].split(" "),dates[j].split(" ") )) {
                    String temp = dates[j+1];
                    dates[j+1] = dates[j];
                    dates[j] = temp;
                }
            }
        }
        i=0;
        while(i<dates.length)
            System.out.print(dates[i++]+" ");
    }
    static boolean olderDate(String[] d1, String[] d2){
        return convertToNum(d1[0]) < convertToNum(d2[0]) || monthNum(d1[1]) < monthNum(d2[1])||convertToNum(d1[2]) < convertToNum(d2[2]);
    }
    static int monthNum(String month){
        String[] months = {"Jan","Feb","Mar","Apr","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int i = 0;
        while(i<months.length){
            if(months[i].equals(month))
                return i;
            i++;
        }
        return 0;
    }

    static int convertToNum(String s ){
        int i,op=0;

        for(i=0;i<s.length();i++)
            op = (s.charAt(i) - '0')+(10*op);
        
        return op;
    }
}