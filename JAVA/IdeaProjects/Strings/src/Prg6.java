class Prg6{
    public static void main(String[] args) {
        //to rev the gn  array w/o creating new array
        char []s={'h','e','l','l','o'};
        System.out.println(reverseString(s));
    }
    public static char[] reverseString(char []s){
        int i;
        char temp;
        for(i=0;i<s.length/2;i++){
            temp=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=temp;
        }
    return s;
    }
}