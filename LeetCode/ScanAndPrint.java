package LeetCode;


public class ScanAndPrint{
    public static void main(String[] args) {
        // Input: b3c6d15
        //       Output: bbbccccccddddddddddddddd
                      // bbbccccccddddddddddddddd
        
        String s = "b3c6d15",op="",num="";
        int i,n=0;
        char c=s.charAt(0);
        for(i=1;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i) <= 'z'){
                for(int x = 0; x<num.length();x++)
                    n = n* (10*x)+ num.charAt(x)-'0';
                for(int x = 0; x<n;x++)
                    op += c;
                c = s.charAt(i);
                num = "";
                n=0;
            }
            else
                num+=s.charAt(i);
        }
        for(int x = 0; x<num.length();x++)
            n = n* (10*x)+ num.charAt(x)-'0';
        for(int x = 0; x<n;x++)
                op += c;
        System.out.println(op);
    }
}