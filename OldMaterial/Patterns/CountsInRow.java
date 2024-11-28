package OldMaterial.Patterns;

public class CountsInRow {
    public static void main(String[] args) {
        int n=5,i;
        String a="1";
        System.out.println(a);
        for(i=1;i<n;i++){
            a=toString(a);
            System.out.println(a);
        }
    }
    private static String toString(String s){
        int count=1,i;
        String a="";
        for(i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1))
                count++;
            else{
                a+=count+""+s.charAt(i);
                count=1;
            }
        }
        a+=count+""+s.charAt(i);
//        System.out.println(a);
        return a;
    }
}
//1
//11
//21
//1211
