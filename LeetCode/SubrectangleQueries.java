package LeetCode;


public class SubrectangleQueries {
    private int[][] rectangle;
    
    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        int i, j;
        for (i = row1; i <= row2; i++) {
            for (j = col1; j <= col2; j++) {
                rectangle[i][j] = newValue;
            }
        }

    }
    
    public int getValue(int row, int col) {
        return rectangle[row][col];
    }
}
