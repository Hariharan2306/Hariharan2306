package LeetCode.BasicProgs;

public class RevNum {
    public static void main(String[] args) {
        int a=121,temp=0,rem;
        int x=a;
        do{
            rem=x%10;
            temp=(temp*10)+rem;
            x/=10;
        }while(x>0);
        System.out.println(temp);
    }
}