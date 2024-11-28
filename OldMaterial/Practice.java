package OldMaterial;
public class Practice{
    public static void main(String[] args) {
        int[] a={1, 2, 3, 4, 5, 6, 7};
        int i=0,j=a.length-1,k=0;

        while(i<j){
            System.out.print(a[j--]);
            System.out.print(a[i++]);
        }
        if(a.length%2 == 0)
            System.out.print(a[i]);
    }
}
//int[] a={1, 2, 3, 4, 5, 6, 7};
//        op={7, 1, 6, 2, 5, 3, 4}