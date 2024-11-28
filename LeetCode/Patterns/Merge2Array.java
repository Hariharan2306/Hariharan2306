package LeetCode.Patterns;

public class Merge2Array {
    public static void main(String[] args) {
     int a[]={6,7,1,2};
     int b[]={3,4,5,1,2,9};
     int c[]=new int[a.length+b.length];
     int i,j;
     for(i=0;i< a.length;i++)
         c[i]=a[i];
     i=0;
     for(j=a.length;j<c.length;j++,i++)
         c[j]=b[i];

     for(i=0;i<c.length;i++)//printing
         System.out.print(c[i]+" ");
    }
}