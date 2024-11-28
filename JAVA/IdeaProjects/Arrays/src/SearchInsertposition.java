public class SearchInsertposition {
    //gn array is sorted
    //to find target in array and give index
    //if element is not in array return suitable position where element would be(index)
    public static void main(String[] args) {
        int nums[]={1,2,5,6};
        int i,target=4,j,index=0;
        for(i=0;i<nums.length;i++){
            for(j=0;j< nums.length;j++){
                if(nums[j]==target-i-1){
                    index=j+1;
                    break;
                    }
            }
            if(index!=0){
                System.out.println(index);
                break;}
        }
    }
}