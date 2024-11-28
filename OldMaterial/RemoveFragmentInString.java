package OldMaterial;
public class RemoveFragmentInString {
    public static void main(String[] args) {
        String s1="Every morning I want to do Exercise";
        String s2="Every morning I want to do meditation without fail";
        String s3="It is important that I want to be happy always";

        String[] s1Arr=toArray(s1);
        String[] s2Arr=toArray(s2);
        String[] s3Arr=toArray(s3);

        String[] eq12=equals(s1Arr,s2Arr);

        String[] finl=equals(s3Arr,eq12);



        for(int i=0;i<idx(finl);i++)
            System.out.println(finl[i]);


        kindaSubstring(s1Arr,finl);
    }

    private static void kindaSubstring(String[] arr1, String[] arr2) {
        int i,j=0,k=0;
        for(i=0;i< idx(arr1);i++){
            if(arr1[i].equals(arr2[j])){
                k=i;
                i++;
                while (arr1[i].equals(arr2[j])){
                    i++;
                    j++;
                    if(j== idx(arr2))
                        break;
                }
            }
        }
        for(j=0;j< arr1.length;j++){
            if(j<k && j>i)
                System.out.print(arr1[j]+" ");
        }
        System.out.println();
    }

    public static String[] equals(String [] a1,String[] a2){
        int i,j,k=0;
        String[] eq=new String[10];
        for(i=0;i<idx(a1);i++){
            for(j=0;j < idx(a2);j++){
                if(a1[i].equals(a2[j]) && a1[i]!=null && a2[j]!=null){
                    eq[k++]=a2[j];
                }
            }
        }
        return eq;
    }
    public static String[] toArray(String str){
        int i,k=0;
        String a="";

        String[] arr =new String[20];

        for(i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                arr[k++]=a;
                a="";
                i++;
            }a+=str.charAt(i);
        }arr[k]=a;
        return arr;
    }
    public static int idx(String[] arr){
        int lastIdx=0;

        for(int i=0;i< arr.length;i++)
            if(arr[i]!=null)
                lastIdx++;
//        System.out.println(lastIdx);
        return lastIdx;
    }
//    public static void removeFragments(String[] a1,String[] a2){
//        int i,j;
//        for (i=0;i<=idx(a1);i++){
//            for(j=0;j<=idx(a2);j++){
//                if(!a1[i].equals(a2[j]))
//                    System.out.print(a2[j]+" ");
//            }
//        }
//        System.out.println();
//    }
}
