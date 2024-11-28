public class MiniRegex{
    public static void main(String[] args){
        int  i,j = 0,k;

        String a = "abcbbcabb";
        // String op = "cb*cab+";
        String s = "cab";

        for (i = 0; i < a.length(); i++) {
            k = i;
            while (a.charAt(i) == s.charAt(j) && i < a.length()) {
                if (j == s.length() - 1) {
                    System.out.println(true);
                    return;
                }
                i++;
                j++;
            }
            i = k;
            j = 0;
        }

        // for(i = 0;i < s.length();i ++){
        //     if(s.charAt(i) == op.charAt(0)){
        //         k = i;
        //         while(j < op.length() && s.charAt(i) == op.charAt(j)){
        //             if(j == op.length() -1){
        //                 System.out.println(op.charAt(j));
        //                 System.out.println(true);
        //                 return;
        //             }
        //             i++;
        //             j++;
        //         }
        //         i = k;
        //     }
        // }
        System.out.print(false);
    }
}