public class Prg2 {
    public static boolean isPalindrome(String s) {
        //is a String palindrome or not with gn upper case and spl characters
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        System.out.println(s+"  removed string ");
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
            rev+=s.charAt(i);
        System.out.println(rev+"  reversed String ");
        if(s.equals(rev))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
     String s="A man, a plan, a canal: Panama";
     if(isPalindrome(s))
         System.out.println("is palindrome");
     else
         System.out.println("not ");
    }
}