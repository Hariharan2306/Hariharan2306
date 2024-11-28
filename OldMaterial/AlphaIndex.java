package OldMaterial;
import java.util.Scanner;
//To output the given string for the given input which is an integer.
// Input: 1 Output: A Input: 26 Output: Z Input : 27 Output: AA Input: 28 Output: AB Input: 1000 Output: ALL

public class AlphaIndex {
    public static void main(String[] args) {
        char[] alpha=new char[26];
        int i,j;
        char A='A';
        for(i=0;i< alpha.length;i++)
            alpha[i]=A++;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter ip");
        int ip= sc.nextInt();

        for(i=2;i<=alpha.length;i++){
            for(j=0;j< alpha.length;j++){
                if(ip<=26){
                    System.out.println(alpha[ip-1]);
                    return;
                }
                else if(i!=0 && ip<=i*26){
//                    System.out.println(i-2);
//                    System.out.println((ip-(i-1)*26)-1);
                    System.out.println(alpha[i-2]+""+ alpha[(ip-(i-1)*26)-1]);
                    return;
                }
            }
        }

    }
}
