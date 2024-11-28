package OldMaterial.Patterns;

public class Pattern3 {
    //fibonacci pattern
    public static void main(String[] args) {
        int n=5;
        int i,j,a,b,c;
        for(i=1;i<=n;i++){
            a=0;
            b=1;
            System.out.print(b);
            for(j=1;j<=i;j++){
                c=a+b;
                System.out.print(c);
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}
