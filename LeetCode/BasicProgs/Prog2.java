package LeetCode.BasicProgs;

public class Prog2{
    public static void main(String[] args) {
        int i=0,n=7;
        boolean notPrime = false;

        for(i=2;i<n;i++){
            if(n%i == 0){ 
                notPrime = true;
                break;
            }
        }
        if(notPrime) System.out.println(n+" is not Prime");
        else System.out.println(n+" is Prime");

        System.out.println();

        for(i=2;i<=n;i++){
            notPrime = false;
            for(int j=2;j<i;j++){
                if(i%j == 0) {
                    notPrime = true;
                    break;
                }
            }
            System.out.println();
            if(notPrime) System.out.println(i+" is not Prime");
            else System.out.println(i+" is Prime");
        }
    }
}
