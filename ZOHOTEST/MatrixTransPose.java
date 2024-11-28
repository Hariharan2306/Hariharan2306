import java.util.Scanner;

public class MatrixTransPose {
    public static void main(String[] args) {
        // int a[][] = {
        //     { 1, 2, 3 },
        //     { 4, 5, 6 },
        //     { 7, 8, 9 }
        // };
        // int a[][] = {
        //     { 1, 2},
        //     { 3, 4 }
        // };

        int a[][] = getInput();
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = a[i].length-1; j >= 0; j--) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
    static int[][] getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of arrays");
        int R = sc.nextInt();
        System.out.println("Enter cols of arrays");
        int C = sc.nextInt();

        int a[][] = new int[R][C];
        for(int i = 0; i< R; i++){
            for(int j = 0; j< C; j++){
                System.out.print("Enter input ");
                a[i][j] = sc.nextInt();
            }
        }
        
        // print
        for(int i = 0; i< R; i++){
            for(int j = 0; j< C; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        return a;
    }
}
