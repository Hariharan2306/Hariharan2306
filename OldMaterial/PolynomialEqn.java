package OldMaterial;
public class PolynomialEqn {
    //last time asked in l3
    //given two array -coeffs of two polynomial equations
    //multiply them and give op
    public static void main(String[] args) {
        int[] a1={1,0,3,2};//1 + 3x^2 + 2x^3
        int[] a2={2,0,4};//2 + 4x^2
        int[] a4=new int[a1.length+a2.length-1];
        int i,j;
        for(i=0;i< a1.length;i++){
            for(j=0;j< a2.length;j++)
                a4[i+j]+=a1[i]*a2[j];
        }
        i=0;            //to print
        while (i<a4.length)
            System.out.print(a4[i++]+" ");
    }
}
//op
//2 0 10 4 12 8
