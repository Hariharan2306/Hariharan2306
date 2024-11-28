package OldMaterial;
public class Substring {
    public static void main(String[] args) {
        String a="babcd";
        String b="bc";
//        int i,j=0;
//        for (i=0;i<a.length();i++){
//            if(b.charAt(j)==a.charAt(i)){
//                while (i<a.length() && j<b.length()){
//                    if(b.charAt(j)!=a.charAt(i))
//                        break;
//                    if(j==b.length()-1 ){
//                        System.out.println("is substring");
//                        return;
//                    }
//                    i++;
//                    j++;
//                }
//            }
//            j=0;
//        }
//        System.out.println("not Substring");
        System.out.println(sub(a,b));
    }
        static boolean sub(String a,String b){
        int i,j=0,k=0;

        for(i=0;i<a.length() && j<b.length();i++){
            if(a.charAt(i) == b.charAt(0)){
                i++;
                j++;
                k=i;
                while(a.charAt(i) == b.charAt(j)) {
                    if (j == b.length() - 1)
                        return true;
                    i++;
                    j++;
                }
                i=k;
                j=0;
            }
        }
        return false;
    }
}