public class StrEqn {
    //imp
    public static void main(String[] args) {
        char arr[]={'1','3','5','7','+','-','*'};
        int i,frstSymbol=0;
        for(i=0;i<arr.length;i++)
            if(arr[i]-48<=0){
                frstSymbol=i;
                break;}
        int ans=arr[0]-48;
        for(i=1;i<frstSymbol && frstSymbol<arr.length;i++,frstSymbol++){
            if(arr[frstSymbol]=='+')
               ans+=(arr[i]-48);
            else if(arr[frstSymbol]=='-')
                ans-=(arr[i]-48);
            else if(arr[frstSymbol]=='*')
                ans*=(arr[i]-48);
            else if(arr[frstSymbol]=='/')
                ans/=(arr[i]-48);
            else if(arr[frstSymbol]=='%')
                ans%=(arr[i]-48);
        }
        System.out.println(ans);
    }
}