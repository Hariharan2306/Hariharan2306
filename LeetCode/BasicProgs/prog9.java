package LeetCode.BasicProgs;

import java.util.Scanner;
public class prog9 {
    //most repeated element in array
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements in array ");
        int n=sc.nextInt();
        System.out.println("enter elements for array ");
        int a[]=new int[n];//original array
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        count(a);
    }
    public static void count(int a[]){
        int freq[]=new int [a.length];//empty array with all 1
        for(int i=0;i<freq.length;i++){
            freq[i]=1;
            for(int j=i+1;j< freq.length;j++){
                if(a[i]==a[j]){
                    freq[i]++;//now freq of elements array
                    a[j]=0;//now all recurring elements are 0
                }
            }
        }
        frequency(a,freq);
    }
    public static void frequency(int a[],int freq[]){
        int big=0;//assumin 0th index is largest
        for(int i=0;i< freq.length;i++){
            if(freq[i]>freq[big])//checkin and changing largest
                big=i;
        }
        System.out.println(a[big]);
    }
}
