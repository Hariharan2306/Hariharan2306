package OldMaterial;
public class HasSubsetSumOrNot {
    public static void main(String[] args) {
        int[] a={3,34,4,12,5,1};
        int sum=6;
        System.out.println(subSet(a, a.length, sum));
    }
    private static boolean subSet(int[] a,int n,int sum){
        if(sum==0)
            return true;
        if (n==0)
            return false;
        if(a[n-1]>sum)
            return subSet(a,n-1,sum);

        return subSet(a,n-1,sum) || subSet(a,n-1,sum-a[n-1]);
    }
}