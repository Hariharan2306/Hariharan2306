public class Scanning {
    public static void main(String[] args) {
        String a="a1b2c5";
        int i,j;
        for(i=0;i<a.length();i++){
            if(i%2!=0){
                j=0;
                while(j<a.charAt(i)-48){
                    System.out.println(a.charAt(i-1));
                    j++;
                }
            }
        }
        System.out.println("double Digits");
        doubleDigit();
    }
    public static void doubleDigit(){
        int i,j,num=0;
        String a="a10b12c11";
        char temp;
        for(i=0;i<a.length();i++){
            if(a.charAt(i)>='0' && a.charAt(i)<='9') {
                temp = a.charAt(i - 1);
                while (i<a.length() && a.charAt(i) >= '0' && a.charAt(i) <= '9') {
                    num = (num * 10) + (a.charAt(i)-48);
                    i++;
                }
                for(j=0;j<num;j++)
                    System.out.println(temp);
            }
            num=0;
        }
    }
}