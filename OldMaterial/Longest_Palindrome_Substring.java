package OldMaterial;
public class Longest_Palindrome_Substring {
    public static void main(String[] args) {
        String a="forgeeksskeegfor";
//        op=geeksskeeg;

        int start=0,end=a.length()-2,i=0;
        while (start < end){
            if(palindrome(a,start,end)) {
                while (start <= end) {
                    System.out.print(a.charAt(start));
                    start++;
                }
                return;
            }
            if(i%2 == 0)
                start++;
            else
                end--;
            i++;
//            System.out.println(start+" "+end);
        }
        System.out.println("-1");
//        System.out.println(palindrome(a,3,a.length()-4));
    }
    static boolean palindrome(String a, int start, int end){
        String s="",p="";

        while (start <= end) {
            s += a.charAt(start);
            start++;
        }
        start=0;
        end=s.length()-1;
        while (end >= start){
            p += s.charAt(end);
            end--;
        }
        return s.equals(p);
    }
}
