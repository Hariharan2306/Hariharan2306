package OldMaterial;
public class MaxOccurrence {
    public static void main(String[] args) {
        String ip="onechar";
//        op-o-1
//        String ip="mississippi";
//        op-s,4 (since s is frst 4 times)

        int[] freq=new int[ip.length()];

        int i,j;
        for(i=0;i<ip.length();i++){
            freq[i]++;
            for(j=i+1;j<ip.length();j++){
                if(ip.charAt(i)==ip.charAt(j))
                    freq[j]++;
            }
        }
        int big=0;
        for(i=0;i<freq.length;i++){
            if(freq[i]>freq[big])
                big=i;
        }
        System.out.println(freq[big]+"-"+ip.charAt(big));
    }
}
