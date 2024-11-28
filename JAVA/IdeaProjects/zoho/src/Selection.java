import java.util.Scanner;
//selection sort
public class Selection {
    int b=23;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entr no of  elements in array");
        int n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("enter array elements ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Sort(a,n);
        print(a,n);
    }
    static void Sort(int a[],int n){
        int i,j,min;
        for(i=0;i<n-1;i++){
            min=i;
            for(j=i+1;j<n;j++)
                if(a[j]<a[min])
                    min=j;
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }
    static void print(int a[],int n){
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
    }
}