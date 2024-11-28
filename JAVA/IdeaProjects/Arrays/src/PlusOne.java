public class PlusOne {
    //given an int array comsider that as an whole number and add one number to it
    //return that op array
    public static void main(String[] args) {
        int nums[]={9,9,9,9};
        boolean flag=true;
        int i;
        for(i= nums.length-1;i>=0;i--){
            if(nums[i]==9)
                nums[i]=0;
            else {
                flag=false;
                nums[i]+=1;
                break;
            }
        }
        if(flag){
            int ans[]=new int[nums.length+1];
            ans[0]=1;
            for(i=0;i< ans.length;i++)
                System.out.println(ans[i]);}
        else
            for(i=0;i< nums.length;i++)
                System.out.println(nums[i]);
    }
}
