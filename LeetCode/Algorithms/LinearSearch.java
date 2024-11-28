package LeetCode.Algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int a[]={2,3,0,6,2,0,0,1};
        int search=6;
        int i,j;
        for(i=0;i<a.length;i++)
            if(a[i]==search)
                System.out.println(i);
    }
}
