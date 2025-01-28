package IntPractice;
public class RotateArray {
    public static void main(String[] args) {   
        String[] a = {"A","B","C","D","E"};
        int i,n = 5;

        // +3 -> C D E A B 
        // -3 -> D E A B C

        n = (n % a.length + a.length) % a.length;

        a = revStrings(a,0,a.length-1);
        // here -> E D C B A

        a = revStrings(a, 0, n-1);
        // here -> C D E B A

        a = revStrings(a, n, a.length-1);
        // here -> C D E A B
        
        i = 0;
        while(i<a.length)
            System.out.print(a[i++]+" ");
        
    }
    static String[] revStrings(String[] a, int start, int end){
        while (start < end) {
            String temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        return a;
    }
}
// https://leetcode.com/problems/rotate-array/description/