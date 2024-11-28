package LeetCode;


public class LHS {
    public static void main(String[] args) {
        int[] a ={1,1,1,1};
        int i,j;

        int maxlen = 0;
        int sub = 0;
        int add = 0;
        boolean hasOtherEl = false;

        for(i=0;i<a.length;i++){
            sub =add =0;
            hasOtherEl = false;
            for(j=0;j<a.length;j++){
                if( a[i]==a[j] && i!=j) {
                    sub++;
                    add++;
                }
                if(a[j] == a[i]-1){   
                    sub++;
                    hasOtherEl = true;
                }
                else if(a[j] == a[i]+1){
                    add++;
                    hasOtherEl = true;
                }
            }
            sub++;
            add++;
            maxlen = maxlen< sub && hasOtherEl ? sub : maxlen;
            maxlen = maxlen< add && hasOtherEl ? add : maxlen;
        }
        System.out.println(maxlen);
    }
}
