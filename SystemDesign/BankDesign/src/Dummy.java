package SystemDesign.BankDesign.src;
import java.util.HashMap;
import java.util.Iterator;

public class Dummy {
    public static void main(String[] args) {
        HashMap <String,String>abc=new HashMap<>();
        Iterator <String>iterator=abc.keySet().iterator();
        abc.put("1","hari");
        abc.put("2","karthi");
        abc.put("3","keerthi");
        String val;
        int i=0;
        while(iterator.hasNext()){
            val=iterator.next();
            i++;
            System.out.println(val+" "+i);
        }
    }
}
