public class SortAsPerSum {
    //to sum each element in a array and sort according to them
    public static void main(String[] args) {
        int a[]={21,12,43,51};
        int []b=new int[a.length];
        //String[] a1=new String[a.length];
        int temp;
        int i,j;
        for(i=0;i<a.length;i++)
            b[i]=sum(a[i]);

        for(i=0;i<b.length-1;i++){
            for(j=0;j<b.length-i-1;j++){
                if(b[j]>b[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
                else if(b[j] == b[j+1]) {
                    if(a[j]>=a[j+1]){
                        temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
        }
        for(i=0;i<b.length;i++)
            System.out.println(a[i]);
            //System.out.println(b[i]);}
    }
    public static int sum(int n){
        int s=0,r;
        while (n!=0){
            r=n%10;
            s+=r;
            n/=10;
        }
        return s;
    }
//    public static int swap(int n1,int n2){
//
//    }
}