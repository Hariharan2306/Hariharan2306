package OldMaterial;
public class Defang_IP_Address {
    public static void main(String[] args) {
        String address="255.100.50.0";
        String a="[.]";
        String op="";
        int i;
        for(i=0;i<address.length();i++){
            if(address.charAt(i) == '.'){
                op+=a;
                continue;
            }
            op+=address.charAt(i);
        }
        System.out.println(op);
    }
}
