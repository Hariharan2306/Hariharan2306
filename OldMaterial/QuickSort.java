package OldMaterial;
public class QuickSort {
    public static void main(String[] args) {
        int[] a={0,-1,2,0,7,6,3};
//        int i=0,j=a.length-1;
        a=quickSort(0,a.length-1,a);
        int i;
        for (i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    private static int partition(int low,int high,int[] arr){
        // pivot
        int pivot = arr[high],temp;

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);
//          System.out.println(low+" low "+i+" i "+pivot+" pivot");
        for (int j = low; j < high; j++) {  //{0,-1,2,0,7,6,3}
            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {
                // Increment index of
                // smaller element
                i++;
//              swap(arr, i, j);
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
//            swap(arr, i + 1, high);
        temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
//        if(pivot==0 && low==0) {
//            System.out.println();
//            for (int k = 0; k <= high; k++)
//                System.out.print(arr[k] + " ");
//            System.out.println();
//        }
        return (i + 1);
    }
        private static int[] quickSort(int start,int end,int[] a){
            int j;
            if(start<end){
                j=partition(start,end,a);
                quickSort(start,j-1,a);
                quickSort(j+1,end,a);
            }
            return a;
    }
}