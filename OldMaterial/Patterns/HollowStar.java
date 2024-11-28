package OldMaterial.Patterns;

public class HollowStar {
    public static void main(String[] args) {
        int n=7;
        int i,j,z=n/2+1;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i<=z){
                    if(j==z-i+1 || j==z+i-1)
                        System.out.print('*');
                    else
                        System.out.print(" ");
                }
                else{
                    if(j==i-z+1 ||j==n-i+z)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
