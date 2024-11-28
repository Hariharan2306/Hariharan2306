import java.util.Scanner;
public class Dummy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int month;
        //int n=sc.nextInt();
        int totInYrs=0,k=1;
        int []mnth =new int[12];
        for(int i=0;i<12;i++){
            if(i==1)
                mnth[i]=28;
            else if (i%2==0)
                mnth[i]=31;
            else
                mnth[i]=30;
            System.out.println(mnth[i]+ " "+k++);
            totInYrs +=mnth[i];

        }
        System.out.println(totInYrs);
        System.out.println(totInYrs*60000*60*24);
    }
}
