package OldMaterial;

public class SortAndMerge {
    public static void main(String[] args) {
        int[] a1={2,3,4,5};
        int[] a2={3,4,7,8,9,10};
        int[] a3=new int[a1.length+a2.length];
        int i=0,j=0,k=0;
        while (i<a1.length && j<a2.length){
            if(a1[i]<a2[j])
                a3[k++]=a1[i++];

            else if(a1[i]==a2[j]){//to avoid repeating elements
                a3[k++]=a2[j++];//but makes empty zeroes in the last
                i++;
            }

            else
                a3[k++]=a2[j++];
        }
        while (i<a1.length)
            a3[k++]=a1[i++];

        while (j<a2.length)
            a3[k++]=a2[j++];

        for(k=0;k< a3.length;k++)
            System.out.println(a3[k]);
    }
}
