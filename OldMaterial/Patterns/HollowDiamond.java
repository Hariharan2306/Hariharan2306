package OldMaterial.Patterns;

public class HollowDiamond {
    public static void main(String[] args) {
        int n=9;
        int half=n/2+1;
        int i,j,k=-1;
        for(i=1;i<=n;i++){
            if(i<=half)
                k++;
            else
                k--;
            for(j=1;j<=n;j++){
                if(i<=half){
//                    System.out.print(k);
                    if(j<=half+k && j>=half-k) {
                        System.out.print(" ");
                    }
                    else
                        System.out.print("*");
//                    k++;
                }
                else{
//                    System.out.print(k);
                    if(j>=half-k && j<=half+k)
                        System.out.print(" ");
                    else
                        System.out.print("*");
//                    k--;
                }
            }
            System.out.println();
        }
    }
}
//package Patterns;
//
//public class HollowDiamond {
//    public static void main(String[] args) {
//        int n=9;
//        int half=n/2+1;
//        int i,j,k=-1;
//        for(i=1;i<=n;i++){
//            if(i<=half)
//                k++;
//            else
//                k--;
//            for(j=1;j<=n;j++){
//                if(i<=half){
//                    if(j==half+k || j==half-k)
//                        System.out.print("*");
//                    else
//                        System.out.print(" ");
////                    k++;
//                }
//                else{
//                    if(j==half-k || j==half+k)
//                        System.out.print("*");
//                    else
//                        System.out.print(" ");
////                    k--;
//                }
//            }
//            System.out.println();
//        }
//    }
//}