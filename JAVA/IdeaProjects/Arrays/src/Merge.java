public class Merge {
    //merging two array in a sorted format
    //with elements repeating on it
    public static void main(String[] args) {
        int []a1={2,3,4,5,6,7,8};
        int []a2={1,2,3,4,4};
        int i=0,j=0,k=0;
        int []a3=new int[a1.length+a2.length];
        while(i< a1.length && j<a2.length){
                if(a1[i]<=a2[j]){
                    a3[k++]=a1[i];
                    i++;
                }
                else {
                    a3[k++] = a2[j];
                    j++;
                }
        }
        while(i<a1.length){
            a3[k++]=a1[i];
            i++;}
        while(j<a2.length){
            a3[k++]=a2[j];
            j++;}
        j=0;
        while (j< a3.length)
            System.out.println(a3[j++]);
    }
}
