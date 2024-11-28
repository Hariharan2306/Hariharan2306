package LeetCode.Matrixx;

public class SortStudentsByScore {
    public static void main(String[] args) {
        int[][] score = { { 10, 6, 9, 1 }, { 7, 5, 11, 2 }, { 4, 8, 3, 15 } };
        int k = 2, i, j;

        for (i = 0; i < score.length - 1; i++) {
            for (j = 0; j < score.length - 1 - i; j++) {
                if (score[j][k] < score[j + 1][k])
                    score = sort(score, j, j + 1);
            }
        }
    }

    private static int[][] sort(int[][] score, int row1, int row2) {
        int j;
        int[] temp = new int[score[row1].length];

        for (j = 0; j < score[row1].length; j++) {
            temp[j] = score[row2][j];
            score[row2][j] = score[row1][j];
            score[row1][j] = temp[j];
        }
        return score;
    }
}
