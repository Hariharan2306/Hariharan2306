package IntPractice;

class LeastLargest{
    public static void main(String[] args) {
        int[] a = {4,5,2,10,8};

        int idx, diff, i, j;
        int[] op = new int[a.length];

        for(i = 0;i < a.length; i++){
            idx = -1;
            diff = 0;
            for(j = 0; j < a.length; j++){
                if(i!=j && a[j] - a[i] > 0 && ((diff > 0 && a[j] - a[i] < diff) || (diff == 0 && a[j] - a[i] > diff)) ){
                    diff = a[j] - a[i];
                    idx = j;
                }
            }
            op[i] = idx == -1 ? -1 : a[idx];
        }
        i = 0;
        while(i<a.length)
            System.out.print(op[i++] +" ");
    }
 }
 