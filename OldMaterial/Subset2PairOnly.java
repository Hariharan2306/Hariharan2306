package OldMaterial;
public class Subset2PairOnly {
    public static void main(String[] args) {
        //has too much flaws
        //works only on sorted array
        int a[] ={1,2,3,4,5};
        int n=6,i,j,k;
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
                k=a[i]+a[j];
                if(k>n){
                    if(j-1==-1)
                        break;
                    System.out.println(a[i]+","+a[j-1]);
                    k=0;
                    break;
                }
            }
        }
    }
}