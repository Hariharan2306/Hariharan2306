package LeetCode.Matrixx;

public class MatrixRotate180 {
    public static void main(String[] args) {
        int a[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        int i,j;

        
        for (i = 0; i < (a.length + 1) /2; i++){
            for( j = 0; j < a[i].length; j++){
                if(i == a.length /2 && j == a[i].length / 2 ) break;
                int temp = a[i][j];
                a[i][j] = a[a.length-1-i][a[i].length-1-j];
                a[a.length-1-i][a[i].length-1-j] = temp;
            }
        }

        // prints
        for( i = 0; i < a.length; i++){
            for(j = 0; j < a.length; j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
}

// 9  8  7
// 6  5  4
// 3  2  1
