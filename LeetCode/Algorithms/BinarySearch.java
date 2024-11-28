package LeetCode.Algorithms;

public class BinarySearch {
    public static void main(String[] args) {;
        int a[]={ 2, 3, 4, 10, 40 };
        int search=2;
        int output=searching(a,search,0, a.length-1);
        System.out.println(output);
    }
    public static int searching(int a[],int search,int low,int high){
        if(a.length==0)
            return -1;

        if (high >= low) {
            int mid=low+(high-1)/2;

            if(search==a[mid])
                return mid;

            else if(search < a[mid])
                return searching(a,search,low,mid-1);

            return searching(a,search,mid+1,high);
        }

    return -1;
    }
}
