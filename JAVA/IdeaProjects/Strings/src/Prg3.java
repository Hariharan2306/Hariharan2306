class Prg3 {
    public static int lengthOfLastWord(String s) {
        //length of last word in gn String with spaces
        int count=0,flag=0;
        for(int n=s.length()-1;n>=0;n--){
            System.out.println(n);
            if(s.charAt(n)==' ' && count!=0){
                flag++;
                System.out.println(flag+"if");
                break;
            }
            else if(s.charAt(n)!=' ') {
                count++;
                System.out.println(count+"else ");
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="  fly me  to  the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}