public class Pattern_2 {
    public static void main(String[] args) {
        int a[] = {7, 7, 7, 5, 5, 3, 2, 1, 3, 1, 3};
        int a2[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int flag = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && a2[i] >= 0) {
                    flag++;
                    a2[j] = -1;
                }
            }
            if(a2[i]>=0 )
                a2[i]=flag;
            //System.out.print(a2[i]);
        }
        for(int i=0;i<3;i++){
            int big=0;
            for(int j=0;j<a.length;j++){
                //System.out.print("\n"+a2[j]);
                if(a2[j]>a2[big])
                    big=j;
            }
            System.out.println(a[big]);
            a2[big]=-1;
        }
    }
}
