package IntPractice;

public class MatrixTranspose90Clockwise {
    public static void main(String[] args) {
        int a[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        int i, k ,j,temp;
        for(i=1;i<a.length;i++){
            for(j=0;j<i;j++){
                if(i != j){
                    temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
        }

        for(i=0;i<a.length;i++){
            j = 0;
            k = a[i].length-1;
            while(j<k){
                temp = a[i][j];
                a[i][j] = a[i][k];
                a[i][k] = temp;
                j++;
                k--;
            }
        }
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }    
}
