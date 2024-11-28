public class InsertionSort {
    public static void main(String []args){
        int a[]={2,3,1,6};
        int n=a.length;
        for(int i=1;i<n;i++) {
            int SortedTo = a[i];
            int j = i - 1;
            while (j>=0 && a[j] > SortedTo) {
                a[j + 1] = a[j];
                //j = j - 1;
                j--;
            }
            a[j + 1] = SortedTo;
        }
        print(a,n);
    }
    static void print(int a[],int n){
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
    }
}
