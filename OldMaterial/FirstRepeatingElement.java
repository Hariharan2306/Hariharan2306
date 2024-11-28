package OldMaterial;
import java.util.HashMap;
public class FirstRepeatingElement {
    //to find first repeating element in array or string
    public static void main(String[] args) {//done
        char[] a={'d','c','a','b'};
        HashMap<Integer,Character> map=new HashMap<>();
        int i;
        boolean flag=true;
        for(i=0;i<a.length;i++){
            if(!map.containsValue(a[i]))
                map.put(i,a[i]);
            else{
                flag=false;
                break;
            }
        }
        if(flag){//to handle no repeating case
            System.out.println(-1);
            return;}
        //loop breaks when element in array is repeated
        //so a[i] has repeating element
        for(int j=0;j<map.size();j++){
            if(map.get(j)==a[i])
                System.out.println(j);
        }
    }
}
