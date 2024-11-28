package LeetCode.BasicProgs;

import java.util.Scanner;
public class Prog7 {
    //frequency of a character in gn String
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String val ");
        String a=sc.nextLine();//ip  string
        frequency(a);
    }
    public static void frequency(String a){
        char b[]=a.toCharArray();//ip string to array
        int freq[]=new int[b.length];//new array same length as ip string
        for(int i=0;i<b.length;i++){
            freq[i]=1;//new arrays all elements are 1
            for(int j=i+1;j<b.length;j++){//j shd start next to i always
                if(b[i]==b[j]){
                    freq[i]++;
                    b[j]=0;
                }
            }
        }
    print(b,freq);
    }
    public static void print(char []b, int []freq){
        System.out.println("the string and its frequency of characters ");
        for(int i = 0; i< b.length; i++){
            if(b[i]!=0)
                System.out.println(b[i]+"-"+freq[i]);
        }
    }
}
