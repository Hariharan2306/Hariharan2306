public class Top3Occurance {
    //to find top 3most Occuring elements in a string
    //constraints elements wont be random symbol
    public static void main(String[] args) {
        String abc="hi hello 123 ";
        char abc1[]=abc.toCharArray();
        int freq[]=new int[abc1.length];
        int i,j;
        for(i=0;i<freq.length;i++){
            freq[i]=0;
            for(j=i+1;j< freq.length;j++)
                if(abc1[i]==abc1[j] && abc1[j]!='*'){
                    ++freq[i];
                    abc1[j]='*';
                }
        }freqPrint(abc1,freq);
    }
    public static void freqPrint(char[] abc1,int[] freq){
        int i;
        for(i=0;i<freq.length;i++)
            if(abc1[i] !='*')
                System.out.println(abc1[i]+"--"+freq[i]);
        top3(freq,abc1);
    }
    public static void top3(int freq[],char abc1[]){
        int i,j;
        for(i=0;i< freq.length;i++)
            System.out.println(freq[i]);
        int big;
        System.out.println("\n\n top 3 most occuring element ");
        for(j=0;j<3;j++){
            big=0;
            for(i=0;i< freq.length;i++){
                if(freq[big] <= freq[i])
                    big=i;
            }
        //System.out.println(big);
        System.out.println(abc1[big]);
        freq[big]=0;
        }
    }
}
