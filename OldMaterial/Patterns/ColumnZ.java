//package Patterns;
//
//public class ColumnZ {
//    public static void main(String[] args) {
//        int n=3;
//        int i,j,k=0;
//        for(i=1;i<=n;i++){
//            for(j=1;j<=n;j++){
//                if(j==1){
//                    System.out.print(i+" ");
//                    k=i;}
//                else {
//                    System.out.print(k + n +" ");
//                    k+=n;}
//            }
//            System.out.println();
//        }
//    }
//}
////1 4 7
////2 5 8
////3 6 9
package OldMaterial.Patterns;
public class ColumnZ {
    public static void main(String[] args) {
        int n=3;
        int i,j,k;
        for(i=1;i<=n;i++){
            k=i;
            for(j=1;j<=n;j++){
                System.out.print(k+" ");
                k+=n;
            }
            System.out.println();
        }
    }
}
//1 4 7
//2 5 8
//3 6 9