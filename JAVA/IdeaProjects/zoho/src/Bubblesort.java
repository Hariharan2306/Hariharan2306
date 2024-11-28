import java.util.Scanner;
public class Bubblesort {
    public static void main(String[]args){
        int a[]={1,3,7,8,12,32};
        Scanner sc=new Scanner(System.in);
        System.out.println("no of elements ");
        int n=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j+1];
                    a[j+1]=a[j];
                    a[j]=t;
                }
            }
        }
        for(int k=0;k<n;k++)
            System.out.println(a[k]);

    }
}
