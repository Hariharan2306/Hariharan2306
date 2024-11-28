public class ReverseWordsRecursion {
    //not yet complete
    public static void main(String[] args) {
        String a="hi ken";
        int i=a.length()-1;
        int k,g=i;
        String op="";
        while(0<=i){
            if(a.charAt(i)==' ' || i==0){
                //k=i;
                reverse(a,i,g);
                g-=i;
                //System.out.println(op);
            }
            i--;
        }
        //System.out.println(op);
    }
    public static void reverse(String a,int i,int g){
        String op="";
        //int k=i;
        while(i<=g){
            op+=a.charAt(i);
            i++;
        }
        System.out.println(op);
        //return op;
    }
}
