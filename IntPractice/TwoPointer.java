package IntPractice;

// Start by swapping the first and last elements of the list. Then, continue swapping elements from both ends towards each other until they meet or cross over.

// Input: [9, 8, 3, 6, 4, 2, 7]
// Output: [7, 2, 4, 6, 3, 8, 9]
public class TwoPointer {
    public static void main(String[] args) {
        int[] a = {9, 8, 3, 6, 4, 2, 7};
        int i = 0,j = a.length-1, temp;
        while(i<j){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        for(i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
