public class AlternateSorting {
    //tp sort ARRAY asc on odd places and even on desc
    public static void main(String[] args) {
        int nums[] = {1, 4, 2, 6, 0, 10};
        int i, j, temp;
        for(i=0;i< nums.length;i+=2)
            for(j=0;j< nums.length-2;j+=2){
                if(nums[j] > nums[j+2]) {
                    temp = nums[j];
                    nums[j]=nums[j+2];
                    nums[j+2]=temp;
                }
            }
        for(i=1;i< nums.length;i+=2)
            for(j=1;j< nums.length-2;j+=2){
                if(nums[j] < nums[j+2]){
                    temp=nums[j];
                    nums[j]=nums[j+2];
                    nums[j+2]=temp;
                }
            }
//        i = 0;
//        j = 0;
//        while (true) {
//            j += 2;
//            if (j < nums.length - 2){
//                if (nums[j] > nums[j + 2]) {
//                    temp = nums[j];
//                    nums[j] = nums[j + 2];
//                    nums[j + 2] = temp;
//                }
//            }
//            else {
//                j = 0;
//                i += 2;
//                if (!(i < nums.length))
//                    break;
//            }
//        }
//        i = 1;
//        j = 1;
//        while (true) {
//            j += 2;
//            if (j < nums.length - 2){
//                if (nums[j] < nums[j + 2]) {
//                    temp = nums[j];
//                    nums[j] = nums[j + 2];
//                    nums[j + 2] = temp;
//                }
//            }
//            else {
//                j = 1;
//                i += 2;
//                if (!(i < nums.length))
//                    break;
//            }
            for (i = 0; i < nums.length; i++)
                System.out.println(nums[i]);

        }
    }
//        0
//        10
//        1
//        6
//        2
//        4