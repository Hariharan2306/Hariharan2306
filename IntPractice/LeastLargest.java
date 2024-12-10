package IntPractice;
public class LeastLargest {
    public static void main(String[] args) {
        int[] a = {4,5,2,10,8};
        int i,j;
        int[] sortedArr = a;

        sort(a);

        // for(i = 0;i<a.length;i++){
        //     for(j = 0;j<sortedArr.length;j++){
        //         if(sortedArr[j] == a[i]){
        //             // System.out.println();
        //             if(j+1 < a.length)
        //                 System.out.print(sortedArr[j+1]+" ");
        //             else System.out.print(-1+" ");
        //         }
        //     }
        // }
    }
    static void sort(int[] a){

        int[] sorted = new int[a.length];
        int k = 0;

        // print least min
        int min = 0, prevSmall = 0;
        for(int j = 0;j<a.length;j++){
            for(int i = 0; i<a.length; i++){
                if(a[i] > a[min] && a[i] > prevSmall){
                    prevSmall = min;
                    min = i;
                }
            }
            a[k] = a[min];
            k++;
            System.out.println(a[min]);
        }
    }
}
