import java.util.*;
public class Prg7 {
    //FIZZ BUZZ
    public static void main(String[] args) {
      //  int a=3;
//        String b="23";
//        System.out.println(a+=Integer.parseInt(b));
        List<String> ans=new ArrayList<String>();
        int n=5;
        for(int i=1;i<=n;i++){
            boolean div3=i%3==0;
            boolean div5=i%5==0;
            if(div3 && div5)
                ans.add("FIZZBUZZ");
            else if(div3)
                ans.add("FIZZ");
            else if(div5)
                ans.add("BUZZ");
            else
                ans.add(Integer.toString(i));
                //ans.add(",");}
        }
            System.out.println(ans);
    }
}
