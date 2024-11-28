package LeetCode;


public class MissAndRepeat {
    public static void main(String[] args) {
        int[] a = {1,1,2,3,4};
        int i;

        int[] op = new int[a.length];
        for(i=0;i<a.length;i++){
            if(op[a[i]-1] != 0 ) 
                System.out.println("Repeat "+a[i]);
            op[a[i]-1] =  1;
        }
        for(i=0;i<a.length;i++)
            if(op[i] == 0)
                System.out.println("Miss "+(i+1));
    }
}
//    X X X
//    X 0 X
//    X X X