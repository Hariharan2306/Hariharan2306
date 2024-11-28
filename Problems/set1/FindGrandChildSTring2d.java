package Problems.set1;

public class FindGrandChildSTring2d {
    public static void main(String[] args) {
        String[][] a = {{"luke","shaw"},
                         {"wayne","rooney"},
                         {"rooney","ronaldo"},
                         {"shaw","rooney"}};
        
        String s ="ronaldo";
        int i=0,k=0;
        String[] child = childStrings(a,s);
        while(child[i]!=null){
            String[] grandChild = childStrings(a, child[i++]);
            // print(grandChild);
            k+=print(grandChild);
        }
        System.out.println(k);
    }
    static int /*void*/print(String[] grandChildern){
        int i=0,k=0;
        while(grandChildern[i]!=null){
            // System.out.println(grandChildern[i++]);
            k++;
            i++;
        }
        return k;
    }
    static String[] childStrings(String[][] a,String s){
        int i,j,k=0;
        String[] child = new String[a.length];
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                if(a[i][j].equals(s) && j!=0)
                    child[k++] = a[i][j-1];
            }
        }
        return child;
    }
}
// 1 time call childstring which finds children of gvn parent,,then again for gc