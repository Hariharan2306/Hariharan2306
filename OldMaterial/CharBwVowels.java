package OldMaterial;
public class CharBwVowels {//done
    public static void main(String[] args) {
        String ip="manager";
        int n,last=ip.length(),i;
        for(n=ip.length()-1;n>=0;n--){
            boolean isVowel=ip.charAt(n)=='a' || ip.charAt(n)=='e' || ip.charAt(n)=='i' || ip.charAt(n)=='o' || ip.charAt(n)=='u';
            if(isVowel){
                i=n;
                while (i<=last-1){
                    System.out.print(ip.charAt(i)+" ");
                    i++;
                }
                System.out.println();
                last=n;
            }
        }
    }
}
