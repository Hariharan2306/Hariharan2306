public class ReverseString {
    //to reverse a given char array without making another array

    public static void main(String[] args) {
        char [] str={'h','e','l','l','o'};
        int i,j;
        char temp;//variables

        for(i=0;i< str.length;i++)          //reversing using tradional buuble sort method
            for(j=0;j< str.length-i-1;j++){
                temp=str[j];
                str[j]=str[j+1];
                str[j+1]=temp;
            }
        for(i=0;i< str.length;i++)          //printing
            System.out.print(str[i]);
        System.out.println("\n");

        for(i=0;i< str.length/2;i++){       //swap str[i] and str[str.length -1-i]
            temp=str[i];                    // using single loop by swapping 1 and last element alone
            str[i]=str[str.length-1-i];
            str[str.length-1-i]=temp;
        }

        for(i=0;i< str.length;i++)          //again printing
            System.out.print(str[i]);
    }
}