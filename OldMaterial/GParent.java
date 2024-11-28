package OldMaterial;
public class GParent {
    public static void main(String[] args) {
        String[][] arr={{"like","shaw"},
                        {"wayne","rooney"},
                        {"rooney","ronaldo"},
                        {"shaw","rooney"}};
        String s="ronaldo";
        String son="";
        int i,j;
        for(i=0;i< arr.length;i++){
            for(j=0;j<arr[0].length;j++){
                if(s.equals(arr[i][j]))
                    son=arr[i][j-1];
            }
        }
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[0].length;j++)
                if(son.equals(arr[i][j]) && j-1>=0)
                    System.out.println(arr[i][j-1]);
        }
    }
}
