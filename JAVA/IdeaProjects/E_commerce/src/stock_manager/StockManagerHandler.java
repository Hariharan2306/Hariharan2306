package stock_manager;

import main.Ecommerce;
import stock_manager.StockManagerDetails;
import stock_manager.StockManagerFileHandler;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StockManagerHandler {
    Scanner sc=new Scanner(System.in);
    public void stockManagerSignUp(){
        System.out.println("enter manager Name ");
        String sName =sc.next();
        System.out.println("enter your new Password ");
        String sPassword =sc.next();
        System.out.println("please RE-enter confirm password ");
        String sRePassword =sc.next();
        System.out.println("please enter mobile number ");
        String sMobNo =sc.next();
        System.out.println("enter email id ");
        String sEmail =sc.next();

        if(validPassword(sPassword, sRePassword))
            sPassword =encryptPassword(sPassword);
        else{
            System.out.println("invalid password try again ");
            return;
        }
        if(sMobNo.length()!=10){
            System.out.println("given mobile number is not 10 digits");
            return;}

        for(int i = 0; i< sMobNo.length(); i++){
            if(!(sMobNo.charAt(i)>='0' && sMobNo.charAt(i)<='9')){
                System.out.println("invalid mobile number");
                return;}
        }
        if(Ecommerce.sMap.size()==0)
            Ecommerce.sId=0;
        else {
            int lastElement=lastKey();//method to find last key element in map below
            Ecommerce.sId= Ecommerce.sMap.get(lastElement).sId;
        }

        Ecommerce.sId++;
        System.out.println("new StockManager id created successfully ");

        StockManagerDetails manager=new StockManagerDetails(Ecommerce.sId,sName, sPassword, sMobNo, sEmail);

        Ecommerce.sMap.put(Ecommerce.sId,manager);
        StockManagerFileHandler handler =new StockManagerFileHandler();
        handler.addManagerToFile(manager);
    }
    private boolean validPassword(String sPassword,String sRePassword){
        if(sPassword.length()==0)
            return false;
        if(!(sPassword.equals(sRePassword)))
            return false;
        for(int i = 0; i< sPassword.length(); i++){//to check password is only char of uppercase or lower or no only
            if(!((sPassword.charAt(i)>='0' && sPassword.charAt(i)<='9') || (sPassword.charAt(i)>='a' && sPassword.charAt(i)<='z') ||(sPassword.charAt(i)>='A' && sPassword.charAt(i)<='Z')))
                return false;
        }
        return true;
    }
    private String encryptPassword(String password){
        char[] pass=password.toCharArray();
        int i;
        for(i=0;i< pass.length;i++){
            switch (pass[i]){
                case '9':
                    pass[i]='0';
                    break;
                case 'z':
                    pass[i]='a';
                    break;
                case 'Z':
                    pass[i]='A';
                    break;
                default:
                    pass[i]+=1;
            }
        }
        return String.valueOf(pass);
    }
    private Integer lastKey(){
        Set<Integer> keys= Ecommerce.sMap.keySet();
        Iterator itr=keys.iterator();

        int last=0;
        while (itr.hasNext()){
            last= (int) itr.next();
        }
        return last;
    }
    public boolean authenticate(){
        System.out.println("enter manager id ");
        int refSId= sc.nextInt();
        System.out.println("enter existing userName ");
        String refName=sc.next();
        System.out.println("enter password ");
        String refPassword= sc.next();

        String refEncryptedPassword=encryptPassword(refPassword);
        StockManagerDetails manager= Ecommerce.sMap.get(refSId);
        if(manager==null) {
            System.out.println("authentication failed -no user found ");
            return false;
        }

        if(manager.sId==refSId && manager.sName.equals(refName) && manager.sPassword.equals(refEncryptedPassword))
            return true;

        return false;
    }
}
