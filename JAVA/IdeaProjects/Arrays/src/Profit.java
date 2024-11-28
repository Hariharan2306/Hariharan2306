public class Profit {
    //consider array elements as stock bought and sold prices
    //if 7 is bought price and rest are sold prices
    //find which stocks gives highest profit
    //here 1 is stock bought and 6 is stock sold so 5 is the highest profit made
    // alternate method find least no then highest number after that
    public static void main(String[] args) {
     int nums[]={7,1,5,3,6,4};
     int i,j,highDiff=0,tempDiff;
     for(i=0;i<nums.length;i++){
         for(j=i+1;j<nums.length;j++){
             tempDiff=nums[j]-nums[i];
             if(tempDiff > highDiff)
                 highDiff=tempDiff;
         }
     }
        System.out.println(highDiff);
    }
}