package OldMaterial;
public class CommonPrefix {
    //to find the most common prefix
    public static void main(String[] args) {//done
        String[] str={"flower","flow","flight"};
//        op="fl"
        int i,k=99,j;
//        prefix(str[0],str[2]);
        for(i=1;i< str.length;i++){
            j=prefix(str[0],str[i]);
            if(k>j)
                k=j;
        }
//        System.out.println(k);
        i=0;
        while (i<=k)
            System.out.print(str[0].charAt(i++));
    }
    private static int prefix(String a,String b){
        int i;
        for(i=0;i<a.length() && i<b.length();i++){
//            System.out.println(i);
            if(!(a.charAt(i)==b.charAt(i)) || i==a.length()-1 || i==b.length()-1) {
//                System.out.println(i-1+"!");
                return i-1;
            }
        }
        return 0;
    }
}
//public class Dummy {
//    public static void main(String[] args) {
//        String[] str={"flower","flow","flight"};
//        String s=str[0];
//        int i,j;
//        for(i=0;i<str.length;i++){
//            if(s.length() > str[i].length())
//                s=str[i];
//        }
//        boolean allHas=true;
//        for(i=0;i<s.length();i++) {
//            for (j = 0; j < str.length; j++) {
//                if (!(s.charAt(i) == str[j].charAt(i))) {
//                    allHas = false;
//                    break;
//                }
//            }
//            if(! allHas)
//                break;
//        }
//        for(j=0;j<i;j++)
//            System.out.print(s.charAt(j));
//        if(j==i)
//            System.out.println("no Prefixx");
//    }
//}
////String[] str={"flower","flow","flight"};
////op="fl"