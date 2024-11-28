package OldMaterial;
public class Jewels {
    public static void main(String[] args) {
//        Input: jewels = "aA", stones = "aAAbbbb"
//        Output: 3
        int i,j;
        String jewels="aA",stones="aAAbbbb";

        int count=0;
        for(i=0;i<jewels.length();i++){
            for(j=0;j<stones.length();j++){
                if(stones.charAt(j) == jewels.charAt(i))
                    count++;
            }
        }
        System.out.println(count);
    }
}