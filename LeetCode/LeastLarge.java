package LeetCode;


public class LeastLarge {
    public static void main(String[] args) {
        int[] a = {4,5,2,10,8};
        int i,j;
        int[] c = new int[a.length];

        i=0;
        while(i<a.length)
            c[i] = a[i++];

        for(i=0;i<c.length-1;i++){
            for(j=0;j<c.length-1-i;j++){
                if(c[j] > c[j+1]){
                    int temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }

        for(i=0;i<a.length;i++){
            for(j=0;j<c.length;j++){
                if(a[i]==c[j]){
                    if(j+1>=a.length){
                        System.out.print(-1+" ");
                        break;
                    } 
                    System.out.print(c[j+1]+" ");
                    break;
                }
            }
        }
    }
}
