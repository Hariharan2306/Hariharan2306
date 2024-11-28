package OldMaterial;
public class Scanning {
    public static void main(String[] args) {
        String a="a1b10c11";
        int i;
        boolean isAlpha,isNextAlpha;
        String  alpha="",count="";
        for(i=0;i<a.length();i++){
            if(a.charAt(i)<='z' && a.charAt(i)>='a') {
                alpha+=a.charAt(i);
            }
            else{
                count+=a.charAt(i);
                if(i == a.length()-1 || a.charAt(i+1)<='z' && a.charAt(i+1)>='a'){
                    print(count,alpha);
                    count="";
                    alpha="";
                }
            }
        }
//        count+=a.charAt(a.length()-1);
//        print(count,alpha);
    }
    private static void print(String count,String alpha){
        int j=0;
        while (j<Integer.parseInt(count)){
            System.out.print(alpha);
            j++;
        }
    }
}
