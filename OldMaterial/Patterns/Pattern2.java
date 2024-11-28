package OldMaterial.Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        int n=5;
        int i,j,k;
        for(i=1;i<=n;i++){
            k=n-i+1;
            for(j=1;j<=n-i+1;j++){
                System.out.print(k+" ");
                k--;
            }
            System.out.println();
        }
    }
}
