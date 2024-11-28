package OldMaterial;
public class DolasNum{
    public static void main(String[] args) {
        int n=35;
        primeFactor(n);
    }
    public static void primeFactor(int n){
        int i;
        boolean flag =true;
        for(i=2;i<n;i++){
            while (n%i==0){
//                System.out.println(i);
                if(!(i==2 || i==3 || i==5)){
                    flag =false;
                    break;
                }
                n/=i;
            }
        }
        if(n>2) {
//            System.out.println(n);
            if (!(n == 2 || n == 3 || n == 5))
                flag = false;
        }
        System.out.println(flag);
    }
}