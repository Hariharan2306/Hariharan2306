package LeetCode;


public class Practice {
    public static void main(String[] args) {
       int i,j;
       int n = 3;
       
       for(i=0;i<n;i++){
         for(j=0;j<n;j++){
            System.out.print((i+1)+ j*n);
         }
         System.out.println();
       }
    }    
}
//1 4 7
//2 5 8
//3 6 9