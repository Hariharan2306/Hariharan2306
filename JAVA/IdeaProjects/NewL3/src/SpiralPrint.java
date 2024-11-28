public class SpiralPrint {
    //to print spirally a given 2d matrix
    public static void main(String[] args) {
        int arr2D[][]={{1,2,3,4},
                       {14,15,16,5},
                       {13,20,17,6},
                       {12,19,18,7},
                       {11,10,9,8}};
        int rowStrt=0,rowEnd= arr2D.length;
        int colStrt=0,colEnd=arr2D[0].length;
        int i;
        while (rowStrt<rowEnd && colStrt<colEnd){
            for(i=colStrt;i<colEnd;i++)
                System.out.println(arr2D[rowStrt][i]+" ");
            rowStrt++;

            for(i=rowStrt;i<rowEnd;i++)
                System.out.println(arr2D[i][colEnd-1]+" ");
            colEnd--;

            for(i=colEnd-1;i>=colStrt;i--)
                System.out.println(arr2D[rowEnd-1][i]);
            rowEnd--;

            for(i=rowEnd-1;i>=rowStrt;i--)
                System.out.println(arr2D[i][colStrt]);
            colStrt++;
        }
    }
}