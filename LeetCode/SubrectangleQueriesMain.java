package LeetCode;


class SubrectangleQueriesMain {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 1 }, { 4, 3, 4 }, { 3, 2, 1 }, { 1, 1, 1 } };
        // SubrectangleQueries q = new SubrectangleQueries(a);
        // q.updateSubrectangle(0, 0, 3, 2, 5);
        // System.out.println(q.getValue(0, 2));

        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(a); 
        System.out.println(subrectangleQueries.getValue(0, 2));
        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        System.out.println(subrectangleQueries.getValue(0, 2));
        System.out.println(subrectangleQueries.getValue(3, 1));
        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        System.out.println(subrectangleQueries.getValue(3, 1));
        System.out.println(subrectangleQueries.getValue(0, 2));
    }
}