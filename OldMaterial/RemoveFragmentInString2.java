package OldMaterial;
public class RemoveFragmentInString2 {
        public static void main(String[] args) {
            String s1="Every morning I want to do Exercise";
            String s2="Every morning I want to do meditation without fail";
            String s3="It is important that I want to be happy always";

            int i;
            String[] s1Arr=toArray(s1);
            String[] s2Arr=toArray(s2);
            String[] s3Arr=toArray(s3);

            String[] a=commonWord(s1Arr,s2Arr);
            String[] b=commonWord(s3Arr,a);

            for(i=0;i<b.length;i++)
                System.out.print(b[i]+" ");
        }
        static String[] commonWord(String[] s1Arr,String[] s2Arr){
            String str="";
            int i,j;

            for(i=0;i< s1Arr.length;i++){
                for(j=0;j< s2Arr.length;j++){
                    if(s1Arr[i].equals(s2Arr[j]))
                        while(s1Arr[i].equals(s2Arr[j])){
                            if(str.equals(""))
                                str+=s1Arr[i];
                            else
                                str+=" "+s1Arr[i];
                            i++;
                            j++;
                        }
                }
            }
            return toArray(str);
        }
        static String[] toArray(String s){
            int i,j=0;
            String w="";

            for(i=0;i<s.length();i++){
                if(s.charAt(i) == ' ')
                    j++;
            }
            String[] sArr=new String[j+1];
            j=0;
            for(i=0;i<s.length() && j< sArr.length ;i++){
                if(s.charAt(i) == ' '){
                    sArr[j++]=w;
                    w="";
                    continue;
                }
                w+=s.charAt(i);
            }
            sArr[j]=w;

            return sArr;
        }
}
