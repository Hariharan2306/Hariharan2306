package OldMaterial.Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        int n=4;
        int i,j,k;
        for(i=1;i<=n;i++){
            k=n;
            for(j=1;j<=2*n-1;j++){
                k--;
                if(j<=n-i || j>=n+i)
                    System.out.print(" ");
                else if(j<=n)
                        System.out.print(k);
                else if(j<=n+i-1){
                        k+=2;
                        System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}
