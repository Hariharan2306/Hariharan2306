package OldMaterial;
public class StrOpEqn {
    public static void main(String[] args) {
        String a="123+-";
        int i,op=0;
        for(i=0;i<a.length();i++){
            if(!(a.charAt(i)>='1' && a.charAt(i)<='9')){
                op=i;
                break;
            }
        }

        int ans=a.charAt(0)-48;
        for( i=1;i<op && op<a.length();i++,op++){
            if(a.charAt(op)=='+')
                ans+=(a.charAt(i)-48);
            else if(a.charAt(op)=='-')
                ans-=(a.charAt(i)-48);
            else if(a.charAt(op)=='*')
                ans*=(a.charAt(i)-48);
            else if(a.charAt(op)=='/')
                ans/=(a.charAt(i)-48);
            else if(a.charAt(op)=='%')
                ans%=(a.charAt(i)-48);
        }
        System.out.println(ans);
    }
}