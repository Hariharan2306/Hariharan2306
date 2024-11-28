public class SubString{
    public static void main(String[] args) {
        String a="testing12";
        String b="1234";
        System.out.println(test(a,b));
    }
    public static int test(String a,String b){
        int i=0,j=0,k;
        while(i<a.length()){
            if(a.charAt(i)==b.charAt(j)){
                k=i;
                while(j<b.length() && i<a.length()){
                    if(a.charAt(i)==b.charAt(j)){
                        if(j==b.length()-1)
                            return k;
                        i++;
                        j++;}
                    else {
                        i=k;
                        break;}
                }
            }
        i++;
        }
        return -1;
    }
}
