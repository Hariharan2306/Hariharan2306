package OldMaterial;
public class NumToWords {
    //to print number gn as string to words
    public static void main(String[] args) {
        String a="111";
        String [] hundreds={"one Hundred and ","two Hundred and ","three Hundred and ","four Hundred and ","five Hundred and ",
                "six Hundred and ","seven Hundred and ","eight Hundred and ","nine Hundred and "};
        String [] tens={"","","twenty ","thirty ","forty ","fifty ","sixty ","seventy ","eighty ","ninety "};
        String [] elevens={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String [] once={"","one","two","three","four","five","six","seven","eight","nine"};
        int i;
        String op="";
        for (i=0;i<a.length();i++){
            if(a.length()==3 && i==0){
                op+=hundreds[a.charAt(i)-48-1];
            continue;
            }
            if(a.length()==3  && i==1 || a.length()==2 && i==0){
                if(a.charAt(i)!='1')
                    op+=tens[a.charAt(i)-48];
                else {
                    i++;
                    op+=elevens[a.charAt(i)-48];
                }
            continue;
            }
            op+=once[a.charAt(i)-48];
        }
        System.out.println(op);
    }
}