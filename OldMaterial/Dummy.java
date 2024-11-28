package OldMaterial;
public class Dummy {
//Given an integer array nums, return the most frequent even element.
//        If there is a tie, return the smallest one. If there is no such element, return -1.

//        Example 1:
//        Input: nums = [0,1,2,2,4,4,1]
//        Output: 2
//        Explanation:
//        The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
//        We return the smallest one, which is 2.
    public static void main(String[] args) {//done
        //done but question name forgot
        int[] a={29,47,21,41,13,37,25,7};
        int i,j;
        int[] freq=new int[a.length];

        for(i=0;i<a.length;i++){
            if(a[i]%2!=0)
                continue;
            freq[i]++;
            for(j=i+1;j<a.length;j++){
                if(a[i]==a[j] && a[i]!=-1){
                    freq[i]++;
                    a[j]=-1;
                }
            }
        }

//        i=0;
//        while (i< freq.length)
//            System.out.println(a[i]+"-"+freq[i++]);
        int big=0;
        for(i=0;i< freq.length;i++){
            if(freq[i]>freq[big])
                big=i;
            else if(freq[big]==freq[i] && big!=i){
                if(a[big]>a[i])
                    big=i;
            }
        }
        if(freq[big]==0){
            System.out.println(-1);
            return;
        }
        System.out.println(a[big]);
    }
}