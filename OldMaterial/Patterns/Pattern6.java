package OldMaterial.Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int i,j;
        int n=4;
        for(i=1;i<=n;i++){
            for (j=1;j<=2*n-1;j++){
                if(j<=n-i)
                    System.out.print(" ");
                else if(j<=n+i-1)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
