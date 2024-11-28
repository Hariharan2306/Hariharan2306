package OldMaterial;

public class TwoDMatrix {
    public static void main(String[] args) {
        int n = 4, i, j, size = 2*n-1;
        int Strt = 0, End = (2 * n - 1) - 1;
        int[][] arr = new int[size][size];
        while(n!=0) {
            for (i = Strt; i <= End; i++) {
                for (j = Strt; j <=End; j++) {
                    if (i == Strt || i == End || j ==Strt || j ==End)
                        arr[i][j] = n;
                }
            }
            Strt++;
            End--;
            n--;
        }
        for(i=0;i<size;i++){
            for(j=0;j< size;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
