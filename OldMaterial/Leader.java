package OldMaterial;
public class Leader {
//    Write a program to print all the LEADERS in the array. An element is leader if it is
//    greater than all the elements to its right side. And the rightmost element is always a leader.

//    For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
//    Let the input array be arr[] and size of the array be size.

    public static void main(String[] args) {
        int[] a={16, 17, 4, 3, 5, 2};
        int i,k;
        boolean flag=true;
        for(i=0;i<a.length;i++){
            k=i+1;
            while (k<a.length){
                if(a[i]<a[k]){
                    flag=false;
                    break;
                }
                k++;
            }
            if(flag)
                System.out.print(a[i]+" ");
            flag=true;
        }
    }
}
