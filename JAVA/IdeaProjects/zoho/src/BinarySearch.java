import java.util.Scanner;
public class BinarySearch {
    public static void main(String []args){
        int a[]={1,2,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        System.out.println("len of a");
        int n=sc.nextInt();
        System.out.println("no to be checked ");
        int f=sc.nextInt();
        if (a[n/2]==f)
            System.out.println("index of element "+n/2);
        else if(a[n/2]>f){
            for(int i=0;i<n/2;i++)
                if(a[i]==f){
                    System.out.println("index of element "+i);
                    break;}
        }
        else
            for(int i=n/2;i<n;i++)
                if(a[i]==f){
                    System.out.println("index of element "+i);
                    break;
                }
    }
}
