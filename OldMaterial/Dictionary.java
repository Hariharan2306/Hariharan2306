package OldMaterial;

public class Dictionary {
    public static void main(String[] args) {
        String[] s={"i","like","sam","sung","samsung","mobile","ice","cream","icecream","man","go","mango"};
        String ip="ilikesamsung";

        int i,j;
        String temp="";

        for(j=0;j<=ip.length();j++) {
            for (i = 0; i < s.length; i++) {
                if (temp.equals(s[i]))
                    temp = "";
                else if(i == s.length-1 && j!=ip.length())
                    temp += ip.charAt(j);
            }
        }
        if(! temp.equals("")){
            System.out.println(false);
            System.out.println(temp);
            return;
        }
        System.out.println(true);
    }
}//public class Dictionary {
//    public static void main(String[] args) {
//        String[] dictionary={"i","like","sung","samsung","mobile","ice","cream","icecream","man","go","mango"};
//        String main="ilikesamsung";
//        int i;
//        String allSub="";
//        for(i=0;i< dictionary.length;i++)
//            if(substring(dictionary[i],main)){
//                System.out.print(dictionary[i]+" ");
//                allSub+=dictionary[i];}
//        System.out.println();
//
//        System.out.println(allSub.length()>=main.length());
//    }
//    public static boolean substring(String sub,String main){
//        int i,j=0;
//        String allSub="";
//        for(i=0;i<main.length();i++){
//            if(j<sub.length() && main.charAt(i)==sub.charAt(j)){
//                while(i<main.length() && j<sub.length() && main.charAt(i)==sub.charAt(j)){
//                    i++;
//                    j++;
//                    if(j==sub.length()){
//                        return true;
////                        allSub+=sub;
////                        System.out.println(sub);
////                        break;
//                    }
//                }
//            }
//        }
//        return false;
//    }
//}
