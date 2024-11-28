public class OccuranceofEachElement {
    //to find how many times each element occurs in an array
    //constraints elements won't be negative
    public static void main(String[] args) {
        int[] arr ={1,1,2,3,5,2};
        int i,j,k=1;
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++)
                if(arr[i]==arr[j] ){
                    k++;
                    arr[j]=-1;
                }
            if(arr[i]!=-1)
                System.out.println(arr[i]+"-"+k);
            k=1;
        }
    }
}
