package LeetCode.Algorithms;

import java.util.Scanner;
public class BubbleSort {
    static int i,j;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];
        System.out.println("enter elements for array ");
        for(i=0;i< arr.length;i++)
            arr[i]=sc.nextInt();
            System.out.println();
        bubbleSort(arr);
    }
    public static void bubbleSort(int []arr){
        int temp;
        for(i=0;i< arr.length;i++)
            for(j=0;j< arr.length-i-1;j++)
                if(arr[j] > arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
        printing(arr);
    }
    public static void printing(int []arr){
        for(i=0;i< arr.length;i++)
            System.out.println(arr[i]);
    }
}