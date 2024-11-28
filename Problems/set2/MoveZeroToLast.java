package set2;

public class MoveZeroToLast {
    public static void main(String[] args) {
        int[] s = {0,0,1,0,2,4,5,6,10};
        int i,count=0;
        for(i=0;i<s.length;i++){
            if(s[i]!=0)
                s[count++] = s[i];
        }
        while(count<s.length)
            s[count++] = 0;
        for(i=0;i<s.length;i++)
            System.out.print(s[i]+" ");
    }
}
