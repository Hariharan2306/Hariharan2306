package LeetCode.DP;

class MissingNum {
    public static void main(String[] args) {
        int[] a = {9,6,4,2,3,5,7,0,1};
        int i;
        int[] op = new int[a.length+1];

        for(i=0;i<a.length;i++){
            op[a[i]]++;
        }
        for(i=0;i<a.length;i++){
            if(op[i]!=1){
                System.out.println(i);
                return;
            }
        }

    }
}