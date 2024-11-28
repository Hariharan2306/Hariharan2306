package OldMaterial;

public class HollowMatrixXO {
    public static void main(String[] args) {//done
        int N=6,M=7;
        int i,j,k=0;
        int row=M,col=N;
        char[][] a=new char[M][N];

        while (col!=0 && row!=0){
            for(i=k;i<row;i++){
                for(j=k;j<col;j++){
                    if(i==k || j==k || i==row-1 || j==col-1) {
                        if (k % 2 == 0)
                            a[i][j] = 'X';
                        else
                            a[i][j] = '0';
                    }
                }
            }
            k++;
            col--;
            row--;
        }

        for(i=0;i<M;i++){
            for(j=0;j<N;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
//    Print the given pattern:
//    Input:
//    N= 3, M=3
//    Output:
//    X X X
//    X 0 X
//    X X X
//
//    Input:
//    N=4 M=5
//    Output:
//    X X X X
//    X 0 0 X
//    X 0 0 X
//    X 0 0 X
//    X X X X
//
//    Input:
//    N=6 M=7
//    X X X X X X
//    X 0 0 0 0 X
//    X 0 X X 0 X
//    X 0 X X 0 X
//    X 0 X X 0 X
//    X 0 0 0 0 X
//    X X X X X X
