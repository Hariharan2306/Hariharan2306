public class Pattern_3 {
    public static void main(String[] args) {
        String a="abcdefg";
        String b="fgcdefh";
        Array o=new Array();
        for(int i=0;i<a.length();i++){
            int count =0;
            while(i!=a.length() && (a.charAt(i)!=b.charAt(i))){
                count ++;
                i++;
            }
            if(count>0){
                System.out.print(o.substring(a,i-count,i)+"\n");
                System.out.print(o.substring(b,i-count,i));
            }
        }
        }
    }
    //1s =1000mil s