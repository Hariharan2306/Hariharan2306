package LeetCode;


public class MiniRegex {
    // asked in interview
    // if * prev elem can be or cant be present which is b here
    // if + prev elem must be present in s which is also b here
    public static void main(String[] args) {
        String s = "abcbbcabb";
        String sub = "cb*cab+";
        int i,j = 0 ,k;
        String op = "";

        for(i=0;i<s.length();i++){
            if(sub.charAt(0) == s.charAt(i)){
                k  = i;
                while(j<sub.length() && i<s.length()){ 
                    if(sub.charAt(j) == s.charAt(i))
                        op+=s.charAt(i);
                    else if(sub.charAt(j) == '+'){
                        if(s.charAt(i) == s.charAt(i-1))
                            op+= s.charAt(i);
                        else break;
                    }
                    else if(sub.charAt(j) == '*' && s.charAt(i) == s.charAt(i-1))
                        op+= s.charAt(i);
                    
                    if(j == sub.length()-1){
                        System.out.println(op);
                        return;
                    }
                    i++;
                    j++;
                }
                i = k;
                j = 0;
            }
        }
        System.out.println(false);
    }
}
