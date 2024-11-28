package JAVA.IdeaProjects.Arrays.src;

public class UpperDiagOrNot {
    public static void main(String[] args) {
        //int N=4;
        int mat[][] = { { 1, 3, 5, 3 },
                        { 0, 4, 6, 2 },
                        { 0, 0, 2, 5 },
                        { 0, 0, 0, 6 } };
        int i,j;
        boolean ans=false;
        for(i=1;i<4;i++)
            for(j=0;j<i;j++)
                if(mat[i][j]==0)
                    ans=true;
                else{
                    ans=false;
                    break;}
        if(ans)
            System.out.println("is a upper ");
        else
            System.out.println("is a lowwer");

    }
}