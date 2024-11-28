public class Array {
    public String substring(String abc,int strt,int end){
        String temp="";
        int i;
        for(i=strt;i<end;i++)
            temp+=abc.charAt(i);
        return temp;
    }
}
