package OldMaterial.Patterns;
//public class New {
//    public static void main(String[] args) {    //done
//        int n=5,i,j,k,x=1,y,t;
//        for(i=n;i>=1;i--){
//            y=i;
//            t=x;
//            for(k=1;k<i;k++)
//                System.out.print("   ");
//            for(j=n;j>=i;j--){
////                if()
//                System.out.print(" ");
//                    System.out.print(t);
//                    t-=y;
//                    y++;
//            }
//            x+=i;
//            System.out.println();
//        }
//    }
//}
public class New {
    public static void main(String[] args) {
        int i, j, n = 5,k=1,x=n,z=0;

        for(i=1;i<=n;i++){
            if(i > 2)
                x--;
            for(j=1;j<=n;j++){
                if(j<=n-i)
                    System.out.print("   ");
                else {
                    if(i == 1)
                        System.out.print("1");
                    else if (j == n - i+1) {
                        k+=x;
                        System.out.print(" "+k);
                        z = k;
                    }
                    else {
                        z = z- j +1;
                        System.out.print(" "+z);
                    }
                }
            }
            System.out.println();
        }
    }
}
//           1
//         6 2
//      10 7 3
//   13 11 8 4
//15 14 12 9 5