public class SumCloseToZero{
    public static void main(String[] args) {
        //assume sum of 2
        int[] a = {1,2,3,4,0,3};
        int i,j,smol=a[0],idx1=-1,idx2=-1;
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
                if(Math.abs(a[i]+a[j]) <= smol && i != j){
                    smol = Math.abs(a[i]+a[j]);
                    idx1 = i;
                    idx2 = j;
                }
            }
        }
        System.out.println(idx1+" "+idx2);
    }
}