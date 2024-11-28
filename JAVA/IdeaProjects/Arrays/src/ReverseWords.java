public class ReverseWords {
    public static void main(String[] args) {
        String a="hi hello";
        int i=0,k=0,noOfWords=0;
        String[] b =new String[10];
        String c="";
        while(i<a.length()){
            if(c.equals(""))//to count no of words in array present
                noOfWords++;
            c+=(a.charAt(i));
            if(a.charAt(i)==' ' || i==a.length()-1){
                b[k++]=c+" ";
                c="";
            }
            i++;
        }
        i=noOfWords-1;
        a="";
        do{
            //if(b[i]!=null)
                a+=b[i--];
//            System.out.println(b[i++]);
        }
        while (i>-1);
        //a=a.replaceAll("null","");
        System.out.println(a);
    }
}
