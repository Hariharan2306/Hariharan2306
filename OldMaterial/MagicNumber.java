package OldMaterial;
public class MagicNumber {
//    Find whether a given number is magic number or not. It is something which gives same digits even after cubing it
    public static void main(String[] args) {
        int a=3;
        int i=0,aCube=1;
        do{
            aCube*=a;
            i++;
        }
        while (i<3);
//        System.out.println(numberAnagram(a,aCube));
        if(!anagram(a,aCube)){
            System.out.println("not a magic number ");
            return;
        }
        System.out.println("is a magic number");
    }
    public static boolean numberAnagram(int a,int b){//general method to find anagram or not
        String aStr=String.valueOf(a);
        String bStr=String.valueOf(b);

        if(aStr.length()!=bStr.length())//not of same size return
            return false;

        int[] aArr=new int[aStr.length()];//converting num to String
        int[] bArr=new int[aStr.length()];

        int i,j;

        for(i=0;i<aArr.length;i++){//converting String num to array
            aArr[i]=aStr.charAt(i)-'0';
            bArr[i]=bStr.charAt(i)-'0';
        }

        boolean found=true;
        for(i=0;i<aArr.length;i++){//traversing each element
            for(j=0;j<bArr.length;j++){
                if(aArr[i]==bArr[j] && bArr[j]!=-1){
                    bArr[j]=-1;
                    break;
                }
                else if(j==bArr.length-1)//if one element not found
                    found=false;
            }
            if(!found)
                break;
        }
        return found;
    }
    public static boolean anagram(int a,int b){
        String aStr=String.valueOf(a);//converting num to String
        String bStr=String.valueOf(b);

        int[] num =new int[10];//creating new array of elements only with 0-9
        int i;

        for(i=0;i< aStr.length();i++){//incrementing and decrementing on the String indices
            num[aStr.charAt(i)-'0']++;
            num[bStr.charAt(i)-'0']--;
        }

        for (i=0;i< num.length;i++) {
            if(num[i]!=0)
                return false;
        }
        return true;
    }
}
//    String aStr="121";
//    String bStr="211";