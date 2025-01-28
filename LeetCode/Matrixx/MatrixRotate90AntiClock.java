package LeetCode.Matrixx;

public class MatrixRotate90AntiClock {
    public static void main(String[] args) {
        int a[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        int i,j;

        // transpose
        for (i = 1; i < a.length; i++){
            for( j = 0; j < i; j++){
                if(i != j){
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
        }

        // rev columns only
        int start  = 0, end = a.length-1;
        while(start < end){
            for(j = 0;j < a[start].length; j++){
                int temp = a[start][j];
                a[start][j] = a[end][j];
                a[end][j] = temp;
            }
            start++;
            end--;
        }

        // prints
        for( i = 0; i < a.length; i++){
            for(j = 0; j < a.length; j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
}

// 3 6 9
// 2 5 8
// 1 4 7
