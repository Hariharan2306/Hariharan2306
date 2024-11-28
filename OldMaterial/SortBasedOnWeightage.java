package OldMaterial;
public class SortBasedOnWeightage {
//        Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
//        1. 5 if a perfect square
//        2. 4 if multiple of 4 and divisible by 6
//        3. 3 if even number
//        And sort the numbers based on the weight and print it as follows
//                <10,its_weight>,<36,its weight><89,its weight>
//                Should display the numbers based on increasing order
    public static void main(String[] args) {
        int[] a={10,36,54,89,12};
        int[] a1=new int[a.length];
        int i,j,temp,temp1;
        for(i=0;i<a.length;i++){
            a1[i]=0;
            if(sqrRoot(a[i]))
                a1[i]+=5;
            if(div(a[i]))
                a1[i]+=4;
            if(oddEve(a[i]))
                a1[i]+=3;
        }
        for(i=0;i<a.length-1;i++){
            for(j=0;j<a.length-i-1;j++){
                if(a1[j]>=a1[j+1]) {
                    temp = a1[j + 1];temp1 = a[j + 1];
                    a1[j+1]=a1[j];a[j+1]=a[j];
                    a1[j]=temp;a[j]=temp1;
                }
            }
        }
        i=0;
        while (i<a.length)
            System.out.println(a[i]+" "+a1[i++]);
    }
    public static boolean sqrRoot(int num){
        int i=1;
        while(i*i<=num){
            if(num%i==0 && num/i==i)
                return true;
            i++;
        }
        return false;
    }
    public static boolean div(int num){
        if(num%4==0 && num%6==0)
            return true;
        return false;
    }
    public static boolean oddEve(int num){
        if(num%2==0)
            return true;
        return false;
    }
}