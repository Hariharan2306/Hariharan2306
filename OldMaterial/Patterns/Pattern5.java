package OldMaterial.Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int n=5;
        int i,j,k;
        for(i=1;i<=n;i++){
            k=i-1;
            for(j=1;j<=2*n-1;j++){
                if(j<=n-i)
                    System.out.print(" ");
                else if(j<=n)
                    System.out.print(++k);
                else if(j<=n+i-1)
                    System.out.print(--k);
            }
            System.out.println();
        }
    }
}
