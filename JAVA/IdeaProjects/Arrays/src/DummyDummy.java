public class DummyDummy {
    public static void main(String[] args) {
        String a="(())()";
        int i=0,j=0,k=0;
        boolean flag=true;
        while(i<a.length()){
            if(a.charAt(i)=='('){
                j=i+1;
                while(j<a.length()){
                    if(a.charAt(j)==')'){
                        k=j;
                        break;}
                    else if(j==a.length()-1){
                        flag=false;
                        //System.out.println(j);
                        break;}
                    j++;
                }
            }
//            else if(a.charAt(i)=='*' || a.charAt(i)=='+' || a.charAt(i)=='-' || a.charAt(i)=='/'){
//                if(i+1<a.length() && a.charAt(i+1)<='z'&& a.charAt(i+1)>='a')
//                    continue;
//                    //flag=true;
//                else{
//                    flag=false;
//                    break;}
//            }
            else if(a.charAt(i)!=')')
                continue;
            else{
                if(j==k)
                    continue;
                else {System.out.println(flag=false);
                break;}}
            i++;
        }
        //if(flag)
            System.out.println(flag);
    }
}
