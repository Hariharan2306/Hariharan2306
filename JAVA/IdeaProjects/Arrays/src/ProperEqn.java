public class ProperEqn {
    //general eqn or not w/o brackets
    public static void main(String[] args) {
        String a="a+b";
        int i=0;
        boolean flag=false;
        while (i<a.length()){
            if(a.charAt(i)=='*' || a.charAt(i)=='+' || a.charAt(i)=='-' || a.charAt(i)=='/')
                if(i+1<a.length() && a.charAt(i+1)<='z'&& a.charAt(i+1)>='a')
                    flag=true;
                else{
                    flag=false;
                    break;}
        i++;
        }
        System.out.println(flag);
    }
}
