package OldMaterial;
public class StringToPattern {
//    Eg 1: Input: a1b10
//    Output: abbbbbbbbbb
//    Eg: 2: Input: b3c6d15
//    Output: bbbccccccddddddddddddddd
//    The number varies from 1 to 99
    public static void main(String[] args) {
        String a="a1b10";
        int i,j=0;
        char tempChar=' ';
        String  tempCount="";
        for(i=0;i<a.length();i++){
            boolean isCharNow=a.charAt(i)>='a' && a.charAt(i)<='z';
//            boolean isCharNext=;
            if(isCharNow)
                tempChar=a.charAt(i);
            else {
                tempCount+=a.charAt(i);
                if(i==a.length()-1 || a.charAt(i+1)>='a' && a.charAt(i+1)<='z'){
                    while(j<Integer.parseInt(tempCount)){
                        System.out.println(tempChar);
                        j++;
                    }
                    j=0;
                    tempChar=' ';
                    tempCount="";}
            }
        }
    }
}
